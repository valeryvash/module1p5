package point1.basepatterns.structural.decorator.myexample;

public class FreightTrain extends TrainDecorator {

    public FreightTrain(Train train) {
        super(train);
    }

    String carryingGods() {
        return "Carrying goods";
    }


    @Override
    public String goingForward() {
        return super.goingForward() + carryingGods();
    }
}
