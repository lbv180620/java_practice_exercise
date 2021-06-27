import static java.lang.System.*;
import java.io.*;

public class Sample1 {
    public static final String FILE_PATH = "./file1.txt";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(FILE_PATH)) {
            int c;
            String s = new String();
            while ((c = fr.read()) != -1) {
                s += (char) c;
            }
            out.println(s);
        } catch (FileNotFoundException e) {
            out.println("ファイルが存在しません");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
