package point1.basepatterns.behavioral.visitor;

public class ElementA implements Element{

    void featureA(){
        System.out.println("featureA method call");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
