package point1.basepatterns.structural.facade;

public class Tool {
    boolean upState;

    public boolean isInUpState() {
        return upState;
    }

    public void moveToUpState() {
        System.out.println("Tool is in up state");
        upState = true;
    }

    public void moveToDownState() {
        System.out.println("Tool is in down state");
        upState = false;
    }
}
