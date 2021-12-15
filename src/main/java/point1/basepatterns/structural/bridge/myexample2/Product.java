package point1.basepatterns.structural.bridge.myexample2;

public abstract class Product {
    private Cab cab;

    public Product(Cab cab) {
        this.cab = cab;
    }

    protected void deliverProduct() {
        cab.deliver();
    }
}
