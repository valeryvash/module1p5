package point1.basepatterns.behavioral.memento;

import java.util.Date;

public class Project {
    String version;
    Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion: " + this.version +
                "\nDate: " + this.date + "\n";
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }
}
