package point1.basepatterns.structural.decorator;

public class TeamLead extends DeveloperDecorator{

    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
