package point1.basepatterns.behavioral.chain.wikiexample;

public class EmailLogger extends Logger {

    public EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Sending via email " + message);
    }
}
