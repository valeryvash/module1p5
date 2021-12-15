package point1.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "hibernate", "spring", "maven", "postgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Valery Shestak", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
