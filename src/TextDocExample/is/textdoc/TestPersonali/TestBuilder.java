package TextDocExample.is.textdoc.TestPersonali;

import TexDocExample.is.textdoc_old.TextDocument;
import TexDocExample.is.textdoc_old.builder.DocumentBuilder;
import TexDocExample.is.textdoc_old.builder.TextDocumentBuilder;
import TexDocExample.is.textdoc_old.html.HTMLTextBuilder;
import TexDocExample.is.textdoc_old.json.JsonTextBuilder;
import TexDocExample.is.textdoc_old.latex.LaTeXTextBuilder;
import TexDocExample.is.textdoc_old.parser.TextDocumetParser;

import java.io.File;
import java.io.PrintWriter;

public class TestBuilder {

    public static void main(String[] args) throws Exception {


        //CONVERSIONE IN HTML
        File f = new File("output.html");

        PrintWriter pw = new PrintWriter(f);

        DocumentBuilder builder = new HTMLTextBuilder(pw);

        TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
        tp.build(); //nel file output.html stiamo scrivendo il documento in HTML

        //NON STIAMO ANCORA SFRUTTUANDO IL PATTERN COMPOSITE -> ci stiamo limitando a prendere un documento in memoria secondaria e stamparlo (che sia a console o su un file di testo)
        //non stiamo usando la classe TextDocumentBuilder


        //CONVERSIONE IN LATEX
        f = new File("output.tex"); //il salvataggio lo realizzeremo in maniera più pulita con il visitor

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

        //QUI SFRUTTIAMO IL PATTERN COMPOSITE
        //STIAMO USANDO TextDocumentBuilder che ci offre rappresentazione in memoria centrale
        TextDocumentBuilder builder2 = new TextDocumentBuilder();
        TextDocument doc = builder2.getDocument();



    }
}
