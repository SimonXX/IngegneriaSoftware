package designPatterns.Visitor;

public class ConcreteVisitor2 implements Visitor{
    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("ConcreteVisitor2 visited ElementA");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("ConcreteVisitor2 visited ElementB");
    }
}
