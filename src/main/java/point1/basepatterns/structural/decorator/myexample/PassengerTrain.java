package point1.basepatterns.structural.decorator.myexample;

public class PassengerTrain extends TrainDecorator {

    public PassengerTrain(Train train) {
        super(train);
    }

    String carryPassengers() {
        return "Carrying passengers. ";
    }

    @Override
    public String goingForward() {
        return super.goingForward() + carryPassengers();
    }
}
