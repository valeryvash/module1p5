package point1.basepatterns.behavioral.strategy;

public class DevRunner {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.setActivity(new Sleeping());
        d.executeActivity();

        d.setActivity(new Training());
        d.executeActivity();

        d.setActivity(new Coding());
        d.executeActivity();

        d.setActivity(new Reading());
        d.executeActivity();

        d.setActivity(new Sleeping());
        d.executeActivity();
    }
}
