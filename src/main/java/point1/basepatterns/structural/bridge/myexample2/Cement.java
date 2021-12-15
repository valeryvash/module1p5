package point1.basepatterns.structural.bridge.myexample2;

public class Cement extends Product {

    public Cement(Cab cab) {
        super(cab);
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Cement deliver in progress");
        super.deliverProduct();
    }
}
