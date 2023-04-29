package TexDocExample.is.textdoc;

import TexDocExample.is.textdoc.TextDocument;
import TexDocExample.is.textdoc.builder.TextDocumentBuilder;
import TexDocExample.is.textdoc.html.HTMLTextBuilder;
import TexDocExample.is.textdoc.json.JsonTextBuilder;
import TexDocExample.is.textdoc.latex.LaTeXTextBuilder;
import TexDocExample.is.textdoc.parser.TextDocumetParser;
import TexDocExample.is.textdoc.NativeTextVisitor;
import TexDocExample.is.textdoc.txt.PlainTextVisitor;
import TexDocExample.is.textdoc.visitor.DirectorVisitor;
import TexDocExample.is.textdoc.visitor.RemoveSubSectionVisitor;
import TexDocExample.is.textdoc.visitor.TextDocumentVisitor;

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
		TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
		tp.build();
		TextDocument doc = builder.getDocument();
		PrintWriter pw = new PrintWriter(System.out);

		TextDocumentVisitor visitor = null;

		if (args.length > 1) {
			switch (args[1]) {
			case "native":
				visitor = new NativeTextVisitor(pw);
				break;
			case "txt":
				visitor = new PlainTextVisitor(pw);
				break;
			case "html":
				// visitor = new HtmlTextVisitor(pw);
				visitor = new DirectorVisitor(new HTMLTextBuilder(pw));
				break;
			case "latex":
				visitor = new DirectorVisitor(new LaTeXTextBuilder(pw));
				break;
			case "json":
				visitor = new DirectorVisitor(new JsonTextBuilder(pw));
				break;
			case "nosub":
				visitor = new RemoveSubSectionVisitor();
				doc.accept(visitor);
				visitor = new NativeTextVisitor(pw);
				break;
			default:
				System.err.println("output type: " + args[1] + "not supported");
				System.exit(1);
			}

		} else
			visitor = new NativeTextVisitor(pw);

		doc.accept(visitor);
	}
}
