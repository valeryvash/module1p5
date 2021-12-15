package point1.basepatterns.structural.bridge.myexample2;

public class Planks extends Product {
    public Planks(Cab cab) {
        super(cab);
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Planks deliver in progress");
        super.deliverProduct();
    }
}
