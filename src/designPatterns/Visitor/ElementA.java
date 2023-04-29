package designPatterns.Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    //altri metodi
}
