package point1.basepatterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase db = new AdapterJavaAppToDatabase();

        db.insert();
        db.update();
        db.select();
        db.remove();
    }
}
