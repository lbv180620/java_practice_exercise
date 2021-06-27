import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        char[] cb = new char[2];
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader("./hello.txt")) {
            while ((size = fr.read(cb)) != -1) {
                sb.append(cb, 0, size);
            }
            out.println(sb.toString());
        } catch (IOException e) {
            ;
        }
    }
}

// public class FileReader
// extends InputStreamReader
// InputStreamREader.read

// Stream.read(byte[] b, offset, len)
// Reader.read(char[] cbuf, offset, len)
