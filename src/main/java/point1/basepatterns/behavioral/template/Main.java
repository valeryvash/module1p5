package point1.basepatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        ReportTemplate reportTemplate =
                new ResearchTemplate(
                "Our goals",
                "We made it !",
                "We are strong!"
        );

        reportTemplate.report();
    }
}
