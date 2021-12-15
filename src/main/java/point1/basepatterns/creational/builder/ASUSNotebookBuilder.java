package point1.basepatterns.creational.builder;

public class ASUSNotebookBuilder extends NotebookBuilder {
    private Notebook asusNotebook;

    @Override
    protected NotebookBuilder createNotebook() {
        this.asusNotebook = new Notebook();
        return this;
    }

    @Override
    protected NotebookBuilder buildName() {
        this.asusNotebook.setName("Asus x5");
        return this;
    }

    @Override
    protected NotebookBuilder buildVendor() {
        this.asusNotebook.setVendor(Vendor.ASUS);
        return this;
    }

    @Override
    protected NotebookBuilder buildProcessorVendor() {
        this.asusNotebook.setProcessorVendor(ProcessorVendor.AMD);
        return this;
    }

    @Override
    protected NotebookBuilder buildScreenDiagonal() {
        this.asusNotebook.setScreenDiagonal(16);
        return this;
    }

    @Override
    public Notebook buildNotebook() {
        return this.asusNotebook;
    }
}
