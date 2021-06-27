import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        byte[] buf = new byte[3];
        try (FileInputStream fis = new FileInputStream("./hello.txt")) {
            while ((size = fis.read(buf)) != -1) {
                out.print(buf);
                out.printf("(%d)\n", size);

                for (byte b : buf) {
                    out.print((char) b);
                }
                out.println();
            }
        } catch (IOException e) {
            ;
        }
    }
}
