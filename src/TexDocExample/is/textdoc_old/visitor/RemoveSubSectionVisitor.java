package TexDocExample.is.textdoc_old.visitor;

import TexDocExample.is.textdoc_old.DocumentElement;
import TexDocExample.is.textdoc_old.Paragraph;
import TexDocExample.is.textdoc_old.Section;
import TexDocExample.is.textdoc_old.SubSection;
import TexDocExample.is.textdoc_old.TextDocument;

import java.util.Iterator;
import java.util.LinkedList;

//Vogliamo appiattire il documento -> facciamo sparire le sotto sezioni di un documento caricato in memoria -> le sottosezioni diventano figli dei paragrafi
public class RemoveSubSectionVisitor implements TextDocumentVisitor {
	private LinkedList<DocumentElement> list = new LinkedList<>(); //accumuliamo stato rispetto alla visita

	@Override
	public void visit(TextDocument d) {//itera su tutti i figli, e facciamo accettare il visitor da tutti i figli -> poiché andremo ad appiattire solo su sezioni e sotto sezioni

		for (DocumentElement de : d) {
			de.accept(this);
		}
	}

	@Override
	public void visit(Section s) {
		assert list.isEmpty(); //costrutto che consente di effettuare controlli a tempo di esecuzione -> vogliamo essere certi che la lista sia vuota altrimenti c'è qualche problema
		// svuota la sezione corrente
		Iterator<DocumentElement> it = s.iterator();
		while (it.hasNext()) {
			DocumentElement de = it.next();
			de.accept(this);
			it.remove(); //svuotiamo la sezione
		}
		// ripopola la sezione
		it = list.iterator();
		while (it.hasNext()) {
			s.addChild(it.next());
			it.remove();
		}
		assert list.isEmpty();

	}

	@Override
	public void visit(SubSection sub) {
		list.add(new Paragraph("--"+sub.getText()+" --\n"));
		for (DocumentElement de : sub) {
			de.accept(this);
		}
	}

	@Override
	public void visit(Paragraph p) {
		list.add(p);
	} //banalmente lo aggiunge alla lista

}
