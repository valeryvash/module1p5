package point1.basepatterns.behavioral.strategy.wikiExample;

public class ConcreteStrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute");
        return a + b;
    }
}
