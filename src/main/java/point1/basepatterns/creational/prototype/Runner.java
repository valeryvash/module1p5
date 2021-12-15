package point1.basepatterns.creational.prototype;

import java.util.Date;
import java.util.Random;

public class Runner extends Person {

    private String name;
    private Date birthDate;
    private int rndNumb;

    public Runner(String name, Date birthDay) {
        this.name = name;
        this.birthDate = birthDay;
        this.rndNumb = new Random().nextInt();
    }

    private void setRndNumb(int rndNumb) {
        this.rndNumb = rndNumb;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Runner r = new Runner(this.name,this.birthDate);
        r.setRndNumb(this.rndNumb);
        return r;
    }

    @Override
    public void work() {
        System.out.println("Runner " + this.name + " is running!");
    }

    @Override
    public void showBirthdayDate() {
        System.out.println(this.birthDate.toString());;
    }

    @Override
    public void showRndNumber() {
        System.out.println(this.rndNumb);
    }
}
