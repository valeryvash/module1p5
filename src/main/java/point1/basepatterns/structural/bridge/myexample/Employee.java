package point1.basepatterns.structural.bridge.myexample;

public class Employee implements Building {
    @Override
    public void createBuilding() {
        System.out.println("Employee create the building");
    }
}
