package point1.basepatterns.structural.bridge.myexample;

public class ProgRun {
    public static void main(String[] args) {
        Structure[] str = {
                new Barn(new Employee()),
//                new Garage(new Employee()),
//                new Barn(new Worker()),
                new Garage(new Worker())
        };

        for (Structure structure : str) {
            structure.creation();
        }
    }
}
