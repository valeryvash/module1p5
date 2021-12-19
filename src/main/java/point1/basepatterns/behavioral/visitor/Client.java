package point1.basepatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> list = new ArrayList<>();

        list.add(new ElementA());
        list.add(new ElementA());
        list.add(new ElementA());
        list.add(new ElementB());
        list.add(new ElementB());
        list.add(new ElementB());
        list.add(new ElementC());
        list.add(new ElementC());
        list.add(new ElementC());


        Visitor visitor = new ConcreteVisitor();

        for (Element element : list) {
            element.accept(visitor);
        }

    }
}
