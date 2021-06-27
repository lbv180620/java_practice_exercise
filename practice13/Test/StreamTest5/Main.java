import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        char[] cbuf = new char[2];
        // StringWriter sw = new StringWriter();
        StringBuilder sb = new StringBuilder();

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("./hello.txt"))) {
            while ((size = isr.read(cbuf)) != -1) {
                // sw.write(cbuf, 0, size);
                sb.append(cbuf, 0, size);
            }
            // out.println(sw.toString());
            out.println(sb.toString());
        } catch (IOException e) {
            ;
        }
    }
}
