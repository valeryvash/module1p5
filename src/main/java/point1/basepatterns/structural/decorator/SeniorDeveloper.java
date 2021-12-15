package point1.basepatterns.structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }


}
