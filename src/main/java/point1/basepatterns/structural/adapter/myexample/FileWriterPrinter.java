package point1.basepatterns.structural.adapter.myexample;

import java.io.*;

public class FileWriterPrinter {
    private final File file = new File("src/main/resources/adapter.file");

    public void writeToFile(String string) {
        try (Writer w = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(w)) {
            bw.write(string);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void printFile() {
        try (Reader r = new FileReader(file);
             BufferedReader br = new BufferedReader(r)) {

            String temp  = br.readLine();

            while (temp != null){
                System.out.println(temp);
                temp = br.readLine();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
