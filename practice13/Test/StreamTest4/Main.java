import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("./hello.txt"))) {
            while ((input = isr.read()) != -1) {
                out.println((char) input);
            }
        } catch (IOException e) {
            ;
        }
    }
}
