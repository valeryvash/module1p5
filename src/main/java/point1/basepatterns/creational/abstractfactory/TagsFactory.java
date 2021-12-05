package point1.basepatterns.creational.abstractfactory;

public class TagsFactory extends AbstractCRUDFactory {

    @Override
    protected AbstractCRUDObject getNewCRUDObject() {
        return new Tag();
    }
}
