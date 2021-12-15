package point1.basepatterns.behavioral.chain.wikiexample;

public class StdOutLogger extends Logger {

    public StdOutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Writing to stdout: " + message);
    }
}
