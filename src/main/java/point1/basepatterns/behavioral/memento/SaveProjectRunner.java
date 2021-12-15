package point1.basepatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project pr = new Project();

        GitHub gitHub = new GitHub();

        System.out.println("Creating new project. Version 1.0");
        pr.setVersionAndDate("Version 1.0");

        System.out.println(pr.toString());

        System.out.println("Saving current version to GitHub");
        gitHub.setSave(pr.save());


        Thread.sleep(5000L); // to get other date

        System.out.println("Update project to version 1.1");

        System.out.println("Writing poor code");

        pr.setVersionAndDate("Version 1.1");

        System.out.println(pr.toString());

        System.out.println("Something goes wrong");

        System.out.println("Rolling back to version");

        pr.load(gitHub.getSave());

        System.out.println(pr.toString());



    }
}
