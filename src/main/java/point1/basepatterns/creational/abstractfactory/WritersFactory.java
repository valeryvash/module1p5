package point1.basepatterns.creational.abstractfactory;

public class WritersFactory extends AbstractCRUDFactory{

    @Override
    protected Writer getNewCRUDObject() {
        return new Writer();
    }
}
