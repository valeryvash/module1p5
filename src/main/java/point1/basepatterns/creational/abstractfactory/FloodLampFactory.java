package point1.basepatterns.creational.abstractfactory;

public class FloodLampFactory extends AbstractIlluminantFactory {
    @Override
    public Illuminant createIlluminant() {
        return new Floodlamp();
    }
}
