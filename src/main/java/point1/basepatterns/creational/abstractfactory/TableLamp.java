package point1.basepatterns.creational.abstractfactory;

public class TableLamp extends Illuminant {
    @Override
    public void switchOn() {
        System.out.println("TableLamp is switched on!");
    }

    @Override
    public void switchOff() {
        System.out.println("TableLamp is switched off!");
    }
}
