package point1.basepatterns.structural.composite.myexample;

public class Cello extends BowedStrings {

    @Override
    public void play() {
        System.out.println("Cello play");
    }

    @Override
    public void stop() {
        System.out.println("Cello stopped");
    }
}
