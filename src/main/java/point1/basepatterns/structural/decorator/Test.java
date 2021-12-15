package point1.basepatterns.structural.decorator;

public class Test {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
