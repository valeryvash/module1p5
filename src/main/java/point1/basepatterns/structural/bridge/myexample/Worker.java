package point1.basepatterns.structural.bridge.myexample;

public class Worker implements Building {

    @Override
    public void createBuilding() {
        System.out.println("Worker build the building");
    }
}
