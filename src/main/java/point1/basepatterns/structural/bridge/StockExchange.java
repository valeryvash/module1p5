package point1.basepatterns.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange in work");
        developer.writesCode();
    }
}
