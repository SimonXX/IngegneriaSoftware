package TexDocExample.is.textdoc.Testing;

import TexDocExample.is.textdoc.TextDocument;
import TexDocExample.is.textdoc.builder.DocumentBuilder;
import TexDocExample.is.textdoc.builder.TextDocumentBuilder;
import TexDocExample.is.textdoc.html.HTMLTextBuilder;
import TexDocExample.is.textdoc.json.JsonTextBuilder;
import TexDocExample.is.textdoc.latex.LaTeXTextBuilder;
import TexDocExample.is.textdoc.parser.TextDocumetParser;

import java.io.File;
import java.io.PrintWriter;

public class Test2 {

    public static void main(String[] args) throws Exception {


        //CONVERSIONE IN HTML
        File f = new File("output.html");

        PrintWriter pw = new PrintWriter(f);

        DocumentBuilder builder = new HTMLTextBuilder(pw);

        TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
        tp.build(); //nel file output.html stiamo scrivendo il documento in HTML


        //CONVERSIONE IN LATEX
        f = new File("output.tex");

        pw = new PrintWriter(f);

        builder = new LaTeXTextBuilder(pw);

        tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());

        tp.build();


        //CONVERSIONE IN JSON
        f = new File("output.json");

        pw = new PrintWriter(f);

        builder = new JsonTextBuilder(pw);

        tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());

        tp.build();


        //ricostruisce l'oggetto TextDocument

        TextDocumentBuilder builder2 = new TextDocumentBuilder();
        tp = new TextDocumetParser(builder2, new File(args[0]).toURI().toURL().toString());
        tp.build();
        TextDocument doc = builder2.getDocument();



    }
}
