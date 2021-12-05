package point1.basepatterns.creational.builder;

public abstract class NotebookBuilder {
    private Notebook notebook;

    protected abstract NotebookBuilder createNotebook();

    protected abstract NotebookBuilder buildName();

    protected abstract NotebookBuilder buildVendor();

    protected abstract NotebookBuilder buildProcessorVendor();

    protected abstract NotebookBuilder buildScreenDiagonal();

    public abstract Notebook buildNotebook();
}
