package designPatterns.Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {//ElementA invoca il metodo fornendo se stesso come parametro
        //double dispace -> il comportamento del metodo non dipende solo
        //dall'oggetto su cui invochiamo (visitor) ma anche da quello che ha invocato (elementA) -> infatti lo passiamo come parametro
        visitor.visitElementA(this);
    }

    //altri metodi
}
