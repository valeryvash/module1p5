package point1.basepatterns.creational.singleton;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Singleton {
    private static Singleton singleton;
    private static final File file = new File("src/main/resources/text.log");

    // standard constructor plug
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
            singleton.writeInFile("Singleton initialized at " + LocalDateTime.now());
        }
        return singleton;
    }

    public void writeInFile(String string) {
        try (Writer w = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(w)) {
            bw.write(string + '\n');
        } catch (IOException ie) {
            System.err.println(ie);
        }
    }

    public void showFileContent() {
        try (Reader r = new FileReader(file);
             BufferedReader br = new BufferedReader(r)) {
            br.lines().forEach(System.out::println);
        } catch (IOException ie) {
            System.err.println(ie);
        }
    }



}
