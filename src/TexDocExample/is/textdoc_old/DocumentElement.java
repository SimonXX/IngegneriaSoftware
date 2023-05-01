package TexDocExample.is.textdoc_old;

import TexDocExample.is.textdoc_old.visitor.TextDocumentVisitor;

public interface DocumentElement {
	String getText();

	default CompositeDocumentElement asComposite() {
		return null;
	}

	CompositeDocumentElement getParent();

	void accept(TextDocumentVisitor visitor);
}
