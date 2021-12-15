package point1.basepatterns.creational.prototype;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p =
//                new Runner("First", new Date(System.currentTimeMillis()));
                new Waterman("First", new Date(System.currentTimeMillis()));

        p.work();
        p.showBirthdayDate();
        p.showRndNumber();

        Person p2 = (Person) p.clone();

        p2.work();
        p2.showBirthdayDate();
        p2.showRndNumber();

    }
}
