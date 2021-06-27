import static java.lang.System.*;
import java.io.*;

public class Sample3 {
    public static final String FILE_PATH = "./file3.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String s;
            while ((s = br.readLine()) != null) {
                out.println(s);
            }
        } catch (FileNotFoundException e) {
            out.println("ファイルが存在しません");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
