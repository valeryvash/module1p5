package point1.basepatterns.creational.factory.refactorGuru;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
