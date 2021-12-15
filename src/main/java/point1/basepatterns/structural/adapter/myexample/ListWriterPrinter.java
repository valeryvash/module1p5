package point1.basepatterns.structural.adapter.myexample;

import java.util.ArrayList;
import java.util.List;

public class ListWriterPrinter {
    private final List<String> list = new ArrayList<>();

    public void writeToCollection(String string) {
        list.add(string);
    }

    public void printCollection() {
        list.stream().forEach(System.out::println);
    }
}
