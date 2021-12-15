package point1.basepatterns.behavioral.strategy;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book/habr...");
    }
}
