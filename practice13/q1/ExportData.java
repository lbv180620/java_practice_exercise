import static java.lang.System.*;
import java.io.*;

public class ExportData {
    public static final String FILE_PATH = "./exdata.txt";

    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("雨にも負けず\n");
            bw.write("風にも負けず\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
