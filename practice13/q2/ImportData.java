import static java.lang.System.*;
import java.io.*;

public class ImportData {
    public static final String FILE_PATH = "../q1/exdata.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String input;
            while ((input = br.readLine()) != null) {
                out.println(input);
            }
        } catch (FileNotFoundException e) {
            out.println("ファイルが存在しません");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
