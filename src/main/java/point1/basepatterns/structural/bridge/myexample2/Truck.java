package point1.basepatterns.structural.bridge.myexample2;

public class Truck implements Cab {
    @Override
    public void deliver() {
        System.out.println("Truck deliver the product");
    }
}
