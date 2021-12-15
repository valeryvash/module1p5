package point1.basepatterns.structural.decorator.myexample;

public class Test {
    public static void main(String[] args) {
        Train train = new FreightTrain(new PassengerTrain(new LeadStaff()));

        System.out.println(train.goingForward());
    }
}
