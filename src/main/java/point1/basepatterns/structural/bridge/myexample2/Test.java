package point1.basepatterns.structural.bridge.myexample2;

public class Test {
    public static void main(String[] args) {
        Product [] pr = {
                new Cement(new Pickup()),
                new Planks(new Pickup()),
                new Cement(new Truck()),
                new Planks(new Truck())
        };

        for (Product product : pr) {
            product.deliverProduct();
        }
    }
}
