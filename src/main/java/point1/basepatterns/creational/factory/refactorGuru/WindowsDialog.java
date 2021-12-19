package point1.basepatterns.creational.factory.refactorGuru;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
