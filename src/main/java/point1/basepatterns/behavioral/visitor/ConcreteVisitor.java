package point1.basepatterns.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        elementA.featureA();
    }

    @Override
    public void visit(ElementB elementB) {
        elementB.featureB();
    }

    @Override
    public void visit(ElementC elementC) {
        elementC.featureC();
    }
}
