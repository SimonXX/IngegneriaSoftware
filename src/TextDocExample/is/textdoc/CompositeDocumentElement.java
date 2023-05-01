package TextDocExample.is.textdoc;


//ci permette di iterare su tutti gli elementi compositi.
public interface CompositeDocumentElement extends DocumentElement,
		Iterable<DocumentElement> {
	
	DocumentElement getChild(int i);

	@Override
	default CompositeDocumentElement asComposite() {
		return this;
	}

	void addChild(DocumentElement el);

	void removeChild(int i);

	int getChildrenCount();

}
