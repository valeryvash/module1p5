package point1.basepatterns.structural.bridge.myexample;

public class Barn extends Structure {

    public Barn(Building person) {
        super(person);
    }

    @Override
    protected void creation() {
        System.out.println("Barn build in progress");
        super.creation();
    }
}
