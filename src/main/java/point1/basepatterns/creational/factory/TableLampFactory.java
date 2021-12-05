package point1.basepatterns.creational.factory;

public class TableLampFactory extends IlluminantFactory {
    @Override
    public Illuminant createIlluminant() {
        return new TableLamp();
    }
}
