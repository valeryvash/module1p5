package point1.basepatterns.structural.decorator.myexample;

public class TrainDecorator implements Train {
    Train train;

    public TrainDecorator(Train train) {
        this.train = train;
    }

    @Override
    public String goingForward() {
        return train.goingForward();
    }
}
