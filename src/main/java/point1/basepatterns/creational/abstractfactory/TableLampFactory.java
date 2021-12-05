package point1.basepatterns.creational.abstractfactory;

public class TableLampFactory extends AbstractIlluminantFactory {
    @Override
    public Illuminant createIlluminant() {
        return new TableLamp();
    }
}
