import static java.lang.System.*;
import java.io.*;

public class Sample2 {
    public static final String FILE_PATH = "./file2.txt";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH)) {
            fw.write("Hello\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
