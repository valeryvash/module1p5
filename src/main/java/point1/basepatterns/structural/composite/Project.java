package point1.basepatterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer dev1 = new JavaDev();
        Developer dev2 = new CppDev();
        Developer dev3 = new CppDev();

        team.add(dev1);
        team.add(dev2);
//        team.add(dev3);
        team.remove(dev3);

        team.createProject();
    }
}
