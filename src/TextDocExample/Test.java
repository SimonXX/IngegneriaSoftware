package TextDocExample;

import TextDocExample.is.textdoc.TextDocument;
import TextDocExample.is.textdoc.builder.TextDocumentBuilder;
import TextDocExample.is.textdoc.html.HTMLTextBuilder;
import TextDocExample.is.textdoc.json.JsonTextBuilder;
import TextDocExample.is.textdoc.latex.LaTeXTextBuilder;
import TextDocExample.is.textdoc.parser.TextDocumentParser;
import TextDocExample.is.textdoc.txt.PlainTextBuilder;
import TextDocExample.is.textdoc.visitor.NativeTextVisitor;
import TextDocExample.is.textdoc.txt.PlainTextVisitor;
import TextDocExample.is.textdoc.visitor.DirectorVisitor;
import TextDocExample.is.textdoc.visitor.RemoveSubSectionVisitor;
import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

import java.io.File;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.err.println("usage java Test inputFile [native|txt|html|latex|json|nosub]");
			System.exit(1);
		}
		TextDocumentBuilder builder = new TextDocumentBuilder();

		File f = new File(args[0]);
		if (!f.isFile()) {
			System.err.println(args[0] + " not found!");
			System.exit(1);
		}
		TextDocumentParser tp = new TextDocumentParser(builder, new File(args[0]).toURI().toURL().toString());
		tp.build();
		TextDocument doc = builder.getDocument();
		PrintWriter pw = new PrintWriter(System.out);

		TextDocumentVisitor visitor = null;

		if (args.length > 1) {//se inseriamo come argomenti "prova.dat <formato destinazione>"
			System.out.println("Si");
			switch (args[1]) {
				case "native" -> visitor = new NativeTextVisitor(pw);
				case "txt" -> visitor = new DirectorVisitor(new PlainTextBuilder(pw));//new PlainTextVisitor(pw);
				case "html" ->
						// visitor = new HtmlTextVisitor(pw);
						visitor = new DirectorVisitor(new HTMLTextBuilder(pw));
				case "latex" -> visitor = new DirectorVisitor(new LaTeXTextBuilder(pw));
				case "json" -> visitor = new DirectorVisitor(new JsonTextBuilder(pw));
				case "nosub" -> {
					visitor = new RemoveSubSectionVisitor();
					doc.accept(visitor);
					visitor = new NativeTextVisitor(pw);
				}
				default -> {
					System.err.println("output type: " + args[1] + "not supported");
					System.exit(1);
				}
			}

		} else
			visitor = new NativeTextVisitor(pw);

		doc.accept(visitor);
	}
}
