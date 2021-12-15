package point1.basepatterns.structural.flyweight;

import point1.basepatterns.structural.adapter.myexample.ListWriterPrinter;

import java.util.ArrayList;
import java.util.List;

public class Fab {
    public static void main(String[] args) {
        DevelopmentTeamFactory dtf = new DevelopmentTeamFactory();

        List<Engineer> engineerTeam = new ArrayList<>();

        engineerTeam.add(dtf.getEngineerBySpecialty("PDE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PIE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("ME"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PDE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PDE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PDE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PDE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PIE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PIE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PIE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("PIE"));
        engineerTeam.add(dtf.getEngineerBySpecialty("ME"));
        engineerTeam.add(dtf.getEngineerBySpecialty("ME"));
        engineerTeam.add(dtf.getEngineerBySpecialty("ME"));
        engineerTeam.add(dtf.getEngineerBySpecialty("ME"));


        for (Engineer engineer : engineerTeam) {
            engineer.processLot();
        }


    }
}
