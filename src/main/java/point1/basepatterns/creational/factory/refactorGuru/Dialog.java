package point1.basepatterns.creational.factory.refactorGuru;

public abstract class Dialog {
    void render() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();

}
