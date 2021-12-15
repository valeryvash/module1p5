package point1.basepatterns.structural.facade;

public class Engineer {

    public void processLots(Tool tool) {
        if (tool.isInUpState()) {
            System.out.println("Engineer processing lots");
        } else {
            System.out.println("Making reports");
        }
    }
}
