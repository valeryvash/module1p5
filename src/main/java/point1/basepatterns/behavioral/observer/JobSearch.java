package point1.basepatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite site = new JavaDevJobSite();

        site.addVacancy("First vacancy");
        site.addVacancy("Second vacancy");

        Observer subscriber = new Subscriber("Valery");
        Observer subscriber2 = new Subscriber("VaSh");

        site.addObserver(subscriber);
        site.addObserver(subscriber2);

        site.addVacancy("Third vacancy");

    }
}
