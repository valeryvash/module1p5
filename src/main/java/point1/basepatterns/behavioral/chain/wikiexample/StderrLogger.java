package point1.basepatterns.behavioral.chain.wikiexample;

public class StderrLogger extends Logger{
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.err.println("Sending via serr " + message);
    }
}
