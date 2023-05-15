package designPatterns.Interpreter;

public class Main {
    public static void main(String[] args) {
        // Creazione del contesto
        Context context = new Context();
        context.setInput("input");

        // Creazione delle espressioni
        AbstractExpression expression1 = new TerminalExpression();
        AbstractExpression expression2 = new NonterminalExpression(expression1);

        // Interpretazione dell'espressione
        expression2.interpret(context);

        // Ottenimento dell'output dal contesto
        String output = context.getOutput();
        System.out.println("Output: " + output);
    }
}
