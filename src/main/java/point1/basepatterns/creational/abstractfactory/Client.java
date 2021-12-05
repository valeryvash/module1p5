package point1.basepatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        /*
         * The client shall know nothing about distinct Factory realisation
         * He works only with an abstract classes and interfaces.
         *
         */


        AbstractIlluminantFactory aif =
                new FloodLampFactory();
//                new TableLampFactory();

        Illuminant lamp = aif.createIlluminant();

        lamp.switchOn();
        lamp.switchOff();
    }
}
