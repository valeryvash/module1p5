package point1.basepatterns.structural.composite.myexample;

public class Flute extends WoodWinds {
    @Override
    public void play() {
        System.out.println("Flute play");
    }

    @Override
    public void stop() {
        System.out.println("Flute stopped");
    }
}
