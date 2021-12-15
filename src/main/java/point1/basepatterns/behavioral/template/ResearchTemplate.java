package point1.basepatterns.behavioral.template;

public class ResearchTemplate extends ReportTemplate {
    private String intro;
    private String results;
    private String conclusion;

    public ResearchTemplate(String intro, String results, String conclusion) {
        this.intro = intro;
        this.results = results;
        this.conclusion = conclusion;
    }

    @Override
    public void introductionText() {
        System.out.println("There is introduction text\n" + intro);
    }

    @Override
    public void resultText() {
        System.out.println("There is results text\n " + results);
    }

    @Override
    public void conclusionText() {
        System.out.println("There is conclusion text\n" + conclusion);
    }
}
