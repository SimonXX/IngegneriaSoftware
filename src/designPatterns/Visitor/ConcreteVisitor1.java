package designPatterns.Visitor;

public class ConcreteVisitor1 implements Visitor{
    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("ConcreteVisitor1 visited ElementA");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("ConcreteVisitor1 visited ElementB");
    }
}
