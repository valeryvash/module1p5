package point1.basepatterns.creational.prototype;

import java.util.Date;
import java.util.Random;

public class Waterman extends Person {

    private String name;
    private Date birthDate;
    private int rndNumb;

    public Waterman(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.rndNumb = new Random().nextInt();
    }

    private void setRndNumb(int rndNumb) {
        this.rndNumb = rndNumb;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Waterman w = new Waterman(this.name, this.birthDate);
        w.setRndNumb(this.rndNumb);
        return w;
    }

    @Override
    public void work() {
        System.out.println("Waterman " + this.name + " is rowing!");
    }

    @Override
    public void showBirthdayDate() {
        System.out.println(this.birthDate.toString());
    }

    @Override
    public void showRndNumber() {
        System.out.println(this.rndNumb);
    }
}
