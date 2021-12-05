package point1.basepatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {

        /*
         * Client shall know nothing about different factories and objects.
         * There is an example, which can be used for CRUD app.
         *
         */

        AbstractCRUDFactory acf = AbstractCRUDFactory
                .getFactory("writer");
//                .getFactory("post");
//                .getFactory("tag");
//                .getFactory("cat"); // Suddenly we have no factory for cats

        AbstractCRUDObject aco = acf.getNewCRUDObject();

        aco.showYourself();
    }
}
