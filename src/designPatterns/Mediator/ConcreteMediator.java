package designPatterns.Mediator;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }


    @Override
    public void send(String message, Colleague colleague) {
        //viene invocato questo metodo send, da uno dei colleague, nei cui parametri vi è anche il colleague che lo ha invocato

        if (colleague == colleague1) {//se il colleague1 invoca il metodo, l'azione viene indirizzata a colleague2
            colleague2.receive(message);

        } else if (colleague == colleague2) {//viceversa
            colleague1.receive(message);
        }
    }
}