package point1.basepatterns.behavioral.chain.wikiexample;

public class TestClass {
    public static void main(String[] args) {
        Logger logger, logger1, logger2;

        logger = new StdOutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        // first level
        logger.message("Function one", Logger.DEBUG);
        // second level
        logger.message("Function two", Logger.NOTICE);
        // third level
        logger.message("Function three",Logger.ERR);

    }
}
