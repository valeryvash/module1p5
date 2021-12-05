package point1.basepatterns.creational.abstractfactory;

public abstract class AbstractCRUDFactory {

    protected abstract AbstractCRUDObject getNewCRUDObject();

    static AbstractCRUDFactory getFactory(String factoryName) {
        switch(factoryName.toLowerCase()){
            case "writer" -> {
                return new WritersFactory();
            }
            case "post" -> {
                return new PostFactory();
            }
            case "tag" -> {
                return new TagsFactory();
            }
            default -> {
                throw new IllegalArgumentException("No such factory type");
            }
        }
    }
}
