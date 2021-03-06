package point1.basepatterns.creational.factory;

public class Floodlamp extends Illuminant {
    @Override
    public void switchOn() {
        System.out.println("Floodlamp is switched on!");
    }

    @Override
    public void switchOff() {
        System.out.println("Floodlamp is switched off!");
    }
}
