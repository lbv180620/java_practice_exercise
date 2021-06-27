import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        char[] cbuf = new char[2];
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("./hello.txt"))) {
            while ((size = isr.read(cbuf)) != -1) {
                out.print(cbuf);
                out.printf("(%d)\n", size);
                Arrays.fill(cbuf, '\0');
            }
        } catch (IOException e) {
            ;
        }
    }
}
