package TextDocExample.is.textdoc.visitor;

import TextDocExample.is.textdoc.*;


//Questo visitor conta il numero si sezioni, sottosezioni e paragrafi del documento
public class StatsVisitor implements TextDocumentVisitor{

    private int numSections;
    private int numParagraphs;

    private int numSubSections;


    //PER OGNI ELEMENTO COMPOSITE EFFETTUIAMO LA VISITA SUI FIGLI
    @Override
    public void visit(TextDocument d) {
        for (DocumentElement de : d) {
            de.accept(this);
        }
        printStats();
    }

    @Override
    public void visit(Section s) {
        for (DocumentElement de : s) {
            de.accept(this);
        }
        numSections++;
    }

    @Override
    public void visit(SubSection sub) {
        for (DocumentElement de : sub) {
            de.accept(this);
        }
        numSubSections++;
    }

    @Override
    public void visit(Paragraph p) {//non serve andare sui figli
        numParagraphs++;
    }//calcola statistiche sul documento

    public void printStats() {
        System.out.println("Number of sections: " + numSections);
        System.out.println("Number of paragraphs: " + numParagraphs);
        System.out.println("Number of subsections: " + numSubSections);
    }
}
