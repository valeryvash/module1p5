package point1.basepatterns.structural.flyweight;

public class ProcessDevelopmentEngineer implements Engineer {
    @Override
    public void processLot() {
        System.out.println("Process development engineer is developing process steps for lot");
    }
}
