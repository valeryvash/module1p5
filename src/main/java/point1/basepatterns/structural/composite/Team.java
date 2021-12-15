package point1.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> devs = new ArrayList<>();

    public void add(Developer developer) {
        devs.add(developer);
    }

    public void remove(Developer developer) {
        devs.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates the project...");
        for (Developer dev : devs) {
            dev.writeCode();
        }
    }
}
