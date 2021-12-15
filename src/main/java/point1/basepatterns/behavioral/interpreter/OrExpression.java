package point1.basepatterns.behavioral.interpreter;

public class OrExpression implements Expression {
    private Expression one;
    private Expression two;

    public OrExpression(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public boolean interpret(String context) {
        return one.interpret(context) || two.interpret(context);
    }
}
