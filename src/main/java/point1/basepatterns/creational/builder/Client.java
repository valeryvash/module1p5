package point1.basepatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Worker w = new Worker(
//                new MSINotebookBuilder());
                new ASUSNotebookBuilder());

        Notebook n = w.buildNotebook();

        System.out.println(n.toString());

    }
}
