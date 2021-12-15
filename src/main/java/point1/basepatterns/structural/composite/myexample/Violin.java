package point1.basepatterns.structural.composite.myexample;

public class Violin extends BowedStrings {
    @Override
    public void play() {
        System.out.println("Violin play");
    }

    @Override
    public void stop() {
        System.out.println("Violin stopped");
    }
}
