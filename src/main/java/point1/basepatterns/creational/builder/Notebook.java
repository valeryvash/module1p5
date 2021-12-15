package point1.basepatterns.creational.builder;

public class Notebook {
    private String name;
    private Vendor vendor;
    private ProcessorVendor processorVendor;
    private int screenDiagonal;

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public void setProcessorVendor(ProcessorVendor processorVendor) {
        this.processorVendor = processorVendor;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return
                "Notebook" +
                "\nname: " + this.name+
                "\nvendor: " + this.vendor+
                "\nprocessorVendor: " + this.processorVendor+
                "\nscreenDiagonal: " + this.screenDiagonal;
    }
}
