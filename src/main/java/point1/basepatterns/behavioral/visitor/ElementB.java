package point1.basepatterns.behavioral.visitor;

public class ElementB implements Element {
    void featureB(){
        System.out.println("featureB method call");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
