package point1.basepatterns.structural.composite.myexample;

public class Oboe extends WoodWinds {
    @Override
    public void play() {
        System.out.println("Oboe plays");
    }

    @Override
    public void stop() {
        System.out.println("Oboe stopped");
    }
}
