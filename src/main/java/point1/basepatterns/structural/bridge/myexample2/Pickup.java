package point1.basepatterns.structural.bridge.myexample2;

public class Pickup implements Cab {
    @Override
    public void deliver() {
        System.out.println("Pickup deliver the product");
    }
}
