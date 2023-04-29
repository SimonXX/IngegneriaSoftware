package designPatterns.Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {//ElementA invoca il metodo fornendo se stesso come parametro
        visitor.visitElementA(this);
    }

    //altri metodi
}
