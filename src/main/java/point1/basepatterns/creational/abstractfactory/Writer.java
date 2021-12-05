package point1.basepatterns.creational.abstractfactory;

public class Writer extends AbstractCRUDObject {
    @Override
    void showYourself() {
        System.out.println("Hello I'm Writer object");
    }
}
