package point1.basepatterns.creational.factory;

public class FloodLampFactory extends IlluminantFactory {
    @Override
    public Illuminant createIlluminant() {
        return new Floodlamp();
    }
}
