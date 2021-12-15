package point1.basepatterns.structural.adapter.myexample;

public class AdapterSaverPrinterToListWriterPrinter extends ListWriterPrinter implements SaverPrinter {
    @Override
    public void save(String s) {
        writeToCollection(s);
    }

    @Override
    public void printAll() {
        printCollection();
    }
}
