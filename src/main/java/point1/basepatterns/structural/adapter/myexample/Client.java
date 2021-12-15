package point1.basepatterns.structural.adapter.myexample;

public class Client {
    public static void main(String[] args) {

        SaverPrinter sp =
                new AdapterSaverPrinterToListWriterPrinter();
//                new AdapterSaverPrinterToFileWriterPrinter();


        sp.save("First\n");
        sp.save("Second\n");
        sp.save("Third\n");

        sp.printAll();
    }
}
