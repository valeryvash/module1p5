package point1.basepatterns.behavioral.interpreter;

public class AndExpression implements Expression {
    private Expression one;
    private Expression two;

    public AndExpression(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public boolean interpret(String context) {
        return one.interpret(context) && two.interpret(context);
    }
}
