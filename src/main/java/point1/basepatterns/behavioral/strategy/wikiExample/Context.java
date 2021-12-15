package point1.basepatterns.behavioral.strategy.wikiExample;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a,b);
    }
}
