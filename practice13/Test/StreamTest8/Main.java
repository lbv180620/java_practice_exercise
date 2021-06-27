import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static final String FILE_PATH = "./hello.txt";
    public static final String COPY_PATH = "./copy.txt";

    public static void main(String[] args) {

        String s;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
                BufferedWriter bw = new BufferedWriter(new FileWriter(COPY_PATH));) {
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            ;
        }

    }
}

// 一つのファイルに同時にtry-with-resourceはできない？
