package point1.basepatterns.structural.bridge.myexample;

public class Garage extends Structure {

    public Garage(Building person) {
        super(person);
    }

    @Override
    protected void creation() {
        System.out.println("Garage build in progress");
        super.creation();
    }
}
