package point1.basepatterns.behavioral.strategy.wikiExample;

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(
                new ConcreteStrategyAdd());
//                new ConcreteStrategyMultiply());

        int result = context.executeStrategy(5, 6);
        System.out.println("Result: " + result);

    }
}
