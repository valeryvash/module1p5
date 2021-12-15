package point1.basepatterns.creational.builder;

public class Worker {
    NotebookBuilder nbb;

    public Worker(NotebookBuilder nbb) {
        this.nbb = nbb;
    }

    public Notebook buildNotebook() {
        return this.nbb
                .createNotebook()
                .buildName()
                .buildVendor()
                .buildProcessorVendor()
                .buildScreenDiagonal()
                .buildNotebook();
    }
}
