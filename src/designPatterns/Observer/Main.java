package designPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject soggetto = new ConcreteSubject();
        ConcretoObserver observer1 = new ConcretoObserver("Observer 1", soggetto);
        ConcretoObserver observer2 = new ConcretoObserver("Observer 2", soggetto);

        soggetto.setNome("Prodotto X");
        soggetto.detach(observer1);
        soggetto.setNome("Prodotto Y");
    }
}
