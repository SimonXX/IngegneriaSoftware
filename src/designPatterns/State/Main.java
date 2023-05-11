package designPatterns.State;

public class Main {
    public static void main(String[] args) {
        // Creiamo il contesto
        Context context = new Context();

        // Chiamiamo la richiesta A, gestita dallo stato A
        context.requestA();

        // Impostiamo lo stato B come stato corrente
        context.setCurrentState(new StateB());

        // Chiamiamo la richiesta B, gestita dallo stato B
        context.requestB();

        // Chiamiamo di nuovo la richiesta A, gestita dallo stato B
        context.requestA();
    }
}