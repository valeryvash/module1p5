package point1.basepatterns.creational.abstractfactory;

public class Post extends AbstractCRUDObject {

    @Override
    void showYourself() {
        System.out.println("Hello I'm a Post object!");
    }
}
