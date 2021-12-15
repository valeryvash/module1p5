package point1.basepatterns.creational.prototype;

public abstract class Person implements Cloneable {

    protected abstract Object clone() throws CloneNotSupportedException;

    public abstract void work();

    public abstract void showBirthdayDate();

    public abstract void showRndNumber();

}
