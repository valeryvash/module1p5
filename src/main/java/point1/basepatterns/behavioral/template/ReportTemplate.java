package point1.basepatterns.behavioral.template;

public abstract class ReportTemplate {
    public void report() {
        System.out.println("Introduction"); // this is header
        System.out.println("===============================");
        introductionText();
        System.out.println("===============================");
        System.out.println("Result"); // this is header
        System.out.println("===============================");
        resultText();
        System.out.println("===============================");
        System.out.println("Conclusion"); // this is header
        System.out.println("===============================");
        conclusionText();
        System.out.println("===============================");
    }

    abstract public void introductionText();

    abstract public void resultText();

    abstract public void conclusionText();
}
