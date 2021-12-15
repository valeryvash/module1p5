package point1.basepatterns.structural.bridge.myexample;

public abstract class Structure {
    private Building person;

    public Structure(Building person) {
        this.person = person;
    }

    protected void creation() {
        person.createBuilding();
    }
}
