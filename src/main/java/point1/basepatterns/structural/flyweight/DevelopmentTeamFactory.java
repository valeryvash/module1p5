package point1.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DevelopmentTeamFactory {
    private Map<String, Engineer> developmentTeam = new HashMap<>();

    public Engineer getEngineerBySpecialty(String specialty) {
        Engineer eng = developmentTeam.get(specialty);
        if (eng == null) {
            System.out.println("Hiring new " + specialty);
            switch (specialty) {
                case "PDE" -> eng = new ProcessDevelopmentEngineer();
                case "PIE" -> eng = new ProcessIntegrationEngineer();
                case "ME" -> eng = new MetrologyEngineer();
                default -> new IllegalArgumentException("no such engineer");
            }
            developmentTeam.put(specialty, eng);
        }
        return eng;
    }

}
