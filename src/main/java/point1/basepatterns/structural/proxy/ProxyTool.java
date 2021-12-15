package point1.basepatterns.structural.proxy;

public class ProxyTool extends Tool {

    private static int upStateCounter = 0;
    private static int downStateCounter = 0;

    @Override
    public boolean isInUpState() {
        return super.isInUpState();
    }

    @Override
    public void moveToUpState() {
        super.moveToUpState();
        upStateCounter++;
    }

    @Override
    public void moveToDownState() {
        super.moveToDownState();
        downStateCounter++;
    }

    public int getUpStateCounter() {
        return upStateCounter;
    }

    public int getDownStateCounter() {
        return downStateCounter;
    }
}
