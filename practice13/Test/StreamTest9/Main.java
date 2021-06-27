import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static final String FILE_PATH = "./hello.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_PATH));
            bw.write("Hello World!");
            bw.newLine();
            bw.write("Thanks!");
            bw.newLine();
            bw.close();
            br = new BufferedReader(new FileReader(FILE_PATH));
            String s;
            while ((s = br.readLine()) != null) {
                out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    ;
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    }
}

// 同じにファイルに読み書きするには、その間に一旦ファイルを閉じてからやる必要がある。
// プログラム => hello.txt => ターミナル とはいっぺんにはできない
