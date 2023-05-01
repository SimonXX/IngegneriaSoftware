package TexDocExample.is.textdoc_old.visitor;

import TexDocExample.is.textdoc_old.DocumentElement;
import TexDocExample.is.textdoc_old.Paragraph;
import TexDocExample.is.textdoc_old.Section;
import TexDocExample.is.textdoc_old.SubSection;
import TexDocExample.is.textdoc_old.TextDocument;
import TexDocExample.is.textdoc_old.builder.DocumentBuilder;

public class DirectorVisitor implements TextDocumentVisitor {

	private DocumentBuilder builder;

	public DirectorVisitor(DocumentBuilder builder) {
		this.builder = builder;
	}

	@Override
	public void visit(TextDocument d) {
		builder.openDocument(d.getTitle());
		for (DocumentElement de : d)
			de.accept(this);
		builder.closeDocument();

	}

	@Override
	public void visit(Section sec) {
		builder.openSection(sec.getTitle());
		for (DocumentElement de : sec)
			de.accept(this);
		builder.closeSection();
	}

	@Override
	public void visit(SubSection sub) {

		builder.openSubsection(sub.getTitle());
		for (DocumentElement de : sub)
			de.accept(this);
		builder.closeSubsection();

	}

	@Override
	public void visit(Paragraph p) {
		builder.addParagraph(p.getText());

	}

}
