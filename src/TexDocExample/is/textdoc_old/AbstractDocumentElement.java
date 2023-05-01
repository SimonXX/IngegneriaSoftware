package TexDocExample.is.textdoc_old;

public abstract class AbstractDocumentElement implements DocumentElement {
	private CompositeDocumentElement parent;

	@Override
	public CompositeDocumentElement getParent() {

		return parent;
	}

	protected void setParent(CompositeDocumentElement parent) {
		this.parent = parent;
	}

	

}
