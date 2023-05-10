package designPatterns.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Metodo pubblico che utilizza l'interfaccia Strategy per eseguire l'algoritmo corretto
    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }

    // Metodo che permette di impostare la strategia a runtime
    public void SetStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
