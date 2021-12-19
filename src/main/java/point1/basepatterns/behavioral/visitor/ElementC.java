package point1.basepatterns.behavioral.visitor;

public class ElementC implements Element {
    void featureC(){
        System.out.println("featureC method call");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
