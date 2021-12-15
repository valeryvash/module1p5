package point1.basepatterns.behavioral.chain.wikiexample;

public abstract class Logger
{
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;

    protected int mask;

    protected Logger next;

    public Logger setNext(Logger next) {
        this.next = next;
        return next;
    }

    public void message(String message, int priority) {
        if (priority <= mask) {
            writeMessage(message);
        }

        if (next != null) {
            next.message(message,priority);
        }
    }

    abstract protected void writeMessage(String message);
}
