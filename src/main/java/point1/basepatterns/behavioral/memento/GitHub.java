package point1.basepatterns.behavioral.memento;

import point1.basepatterns.behavioral.memento.Save;

public class GitHub {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
