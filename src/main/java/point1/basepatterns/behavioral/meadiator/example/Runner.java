package point1.basepatterns.behavioral.meadiator.example;

public class Runner {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("Hi folks!");
        c2.send("Hi man!");
    }
}
