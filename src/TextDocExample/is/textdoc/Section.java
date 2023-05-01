package TextDocExample.is.textdoc;

import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

public final class Section extends AbstractCompositeDocumentElement {
	private String title;

	public Section(String title) {
		this.title = title;
	}

	public Section() {
		this("");
	}

	@Override
	public String getText() {

		return getTitle();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String string) {
		title = string;
	}

	@Override
	public void accept(TextDocumentVisitor visitor) {
		visitor.visit(this);
	}//visitElementA -> il metodo viene specializzato in base ala parametro di input

	@Override
	public void addChild(DocumentElement el) {
		if (!(el instanceof Paragraph || el instanceof SubSection))
			throw new IllegalArgumentException();
		super.addChild(el);
	}
	
	
}
