package point1.basepatterns.structural.facade;

public class WorkFlow {
    Engineer engineer = new Engineer();
    Lot lot = new Lot();
    Tool tool = new Tool();

    public void start(){
        tool.moveToUpState();
        lot.doLot();
        engineer.processLots(tool);
    }

    public void stop() {
        tool.moveToDownState();
        engineer.processLots(tool);
    }

}
