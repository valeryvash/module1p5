package point1.basepatterns.structural.adapter.myexample;

public class AdapterSaverPrinterToFileWriterPrinter extends FileWriterPrinter implements SaverPrinter {
    @Override
    public void save(String s) {
        writeToFile(s);
    }

    @Override
    public void printAll() {
        printFile();
    }
}
