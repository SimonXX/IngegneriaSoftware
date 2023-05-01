package TextDocExample;

import TexDocExample.is.textdoc_old.TextDocument;
import TexDocExample.is.textdoc_old.builder.TextDocumentBuilder;
import TexDocExample.is.textdoc_old.parser.TextDocumetParser;
import TextDocExample.is.textdoc.builder.DocumentBuilder;
import TextDocExample.is.textdoc.builder.NativeBuilder;
import TextDocExample.is.textdoc.html.HTMLTextBuilder;
import TextDocExample.is.textdoc.json.JsonTextBuilder;
import TextDocExample.is.textdoc.latex.LaTeXTextBuilder;
import TextDocExample.is.textdoc.parser.TextDocumentParser;
import TextDocExample.is.textdoc.txt.PlainTextBuilder;

import java.io.File;
import java.io.PrintWriter;

public class SimpleBuilderTest {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("No input file name given!");
			System.exit(1);
		}
		PrintWriter pw = new PrintWriter(System.out);
		//DocumentBuilder builder = new LaTeXTextBuilder(pw);
		DocumentBuilder builder = new HTMLTextBuilder(pw);

		//DocumentBuilder builder = new JsonTextBuilder(pw);
		//DocumentBuilder builder = new PlainTextBuilder(pw);
		//DocumentBuilder builder = new NativeBuilder(pw);

		TextDocumentParser tp = new TextDocumentParser(builder, new File(args[0]).toURI().toURL().toString());
		tp.build();

		//PER MODIFICARE LA RAPPRESENTAZIONE IN MEMORIA è SUFFICIENTE CAMBIARE IL BUILDER (personal)
		TextDocumentBuilder builder2 = new TextDocumentBuilder(); //vogliamo poter usare il metodo builder2.getDocument();
		TextDocumetParser tp2= new TextDocumetParser(builder2, new File(args[0]).toURI().toURL().toString());
		tp2.build();
		TextDocument doc2 = builder2.getDocument();
		PrintWriter pw2 = new PrintWriter(System.out);

	}
}
