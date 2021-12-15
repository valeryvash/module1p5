package point1.basepatterns.structural.bridge;

public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankSystem in work");
        developer.writesCode();
    }
}
