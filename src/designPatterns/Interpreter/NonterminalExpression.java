package designPatterns.Interpreter;

public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression expression;

    public NonterminalExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    @Override
    public void interpret(Context context) {
        // Implementazione dell'interpretazione per il caso del NonterminalExpression
        // Utilizza il contesto per ottenere l'input e produrre l'output
        // Inoltre, delega l'interpretazione all'espressione interna
        expression.interpret(context);
    }
}