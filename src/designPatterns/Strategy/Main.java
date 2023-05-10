package designPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'istanza di ConcreteStrategyA
        ConcreteStrategyA strategyA = new ConcreteStrategyA();

        // Creazione dell'istanza di ConcreteStrategyB
        ConcreteStrategyB strategyB = new ConcreteStrategyB();

        // Creazione dell'istanza di ConcreteStrategyC
        ConcreteStrategyC strategyC = new ConcreteStrategyC();

        // Creazione dell'istanza di Context con ConcreteStrategyA come strategia iniziale
        Context context = new Context(strategyA);

        // Esecuzione dell'algoritmo con ConcreteStrategyA
        context.ContextInterface();

        // Cambio della strategia a ConcreteStrategyB
        context.SetStrategy(strategyB);

        // Esecuzione dell'algoritmo con ConcreteStrategyB
        context.ContextInterface();

        // Cambio della strategia a ConcreteStrategyC
        context.SetStrategy(strategyC);

        // Esecuzione dell'algoritmo con ConcreteStrategyC
        context.ContextInterface();
    }
}
