import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./hello.txt");
            int input;
            while ((input = fis.read()) != -1) {
                if (0x1F < input && input < 0x7E) {
                    out.println(input);
                    out.println((char) input);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    }
}

// int input = fis.read();
// while (input != -1){}
// とすると無限ループになってしまう
// なぜなら、この場合常に、inputは'h'の文字コードを参照しているので、input != -1がずっと続くから
