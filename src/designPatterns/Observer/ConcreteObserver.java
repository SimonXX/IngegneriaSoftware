package designPatterns.Observer;

// Concreto Observer (ConcreteObserver)
class ConcretoObserver implements Observer {
    private String nome;
    private Subject subject;

    public ConcretoObserver(String nome, Subject subject) {
        this.nome = nome;
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Osservatore " + nome + " ha ricevuto la notifica del cambiamento di stato: " + subject.getStato());
    }
}