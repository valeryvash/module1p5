package point1.basepatterns.behavioral.chain.analogy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchCatch {
    public static void main(String[] args) {

        // on my look the first analogy for this pattern is try with multiple catch blocks
        try {

//            FileInputStream fis = new FileInputStream("Z:\\sss");
            FileInputStream fis = new FileInputStream("src/main/resources/adapter.file");
//            fis.read();

            if (true) throw new NullPointerException("This message cannot be catched");

        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
