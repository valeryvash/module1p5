package point1.basepatterns.creational.abstractfactory;

public class PostFactory extends AbstractCRUDFactory {
    @Override
    protected AbstractCRUDObject getNewCRUDObject() {
        return new Post();
    }
}
