package TextDocExample.is.textdoc;

import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

public final class Paragraph implements DocumentElement {//non deve preoccuparsi della gestione dei figli poiché è una foglia
	private String text;

	public Paragraph() {
		this("");
	}

	public Paragraph(String text) {
		this.text = text;
	}

	@Override
	public String getText() {

		return text;
	}



	public void setText(String string) {
		text = string;
	}

	@Override
	public void accept(TextDocumentVisitor visitor) {
		visitor.visit(this);
	}

}
