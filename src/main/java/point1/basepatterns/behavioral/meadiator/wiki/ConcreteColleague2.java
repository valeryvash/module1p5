package point1.basepatterns.behavioral.meadiator.wiki;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("ConcreteColleague2 gets message: " + message);
    }
}
