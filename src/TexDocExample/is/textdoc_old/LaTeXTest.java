package TexDocExample.is.textdoc_old;

import TexDocExample.is.textdoc_old.builder.DocumentBuilder;
import TexDocExample.is.textdoc_old.latex.LaTeXTextBuilder;
import TexDocExample.is.textdoc_old.parser.TextDocumetParser;

import java.io.File;
import java.io.PrintWriter;

public class LaTeXTest {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("No input file name given!");
			System.exit(1);
		}
		PrintWriter pw = new PrintWriter(System.out);
		DocumentBuilder builder = new LaTeXTextBuilder(pw);
		// DocumentBuilder builder = new HTMLTextBuilder(pw);
		// DocumentBuilder builder = new JsonTextBuilder(pw);

		TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
		tp.build();

	}
}
