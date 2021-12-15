package point1.basepatterns.creational.builder;

public class MSINotebookBuilder extends NotebookBuilder {
    private Notebook msiNotebook;

    @Override
    public NotebookBuilder createNotebook() {
        this.msiNotebook = new Notebook();
        return this;
    }

    @Override
    public NotebookBuilder buildName() {
        msiNotebook.setName("Leopard");
        return this;
    }

    @Override
    public NotebookBuilder buildVendor() {
        this.msiNotebook.setVendor(Vendor.MSI);
        return this;
    }

    @Override
    public NotebookBuilder buildProcessorVendor() {
        this.msiNotebook.setProcessorVendor(ProcessorVendor.INTEL);
        return this;
    }

    @Override
    public NotebookBuilder buildScreenDiagonal() {
        this.msiNotebook.setScreenDiagonal(17);
        return this;
    }

    @Override
    public Notebook buildNotebook() {
        return this.msiNotebook;
    }
}
