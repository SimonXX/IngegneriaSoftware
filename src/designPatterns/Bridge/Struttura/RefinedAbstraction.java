package designPatterns.Bridge.Struttura;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void operation() {
        System.out.println("RefinedAbstraction: operation");
        impl.operationImpl();
    }
}
