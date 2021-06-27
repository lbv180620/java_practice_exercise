import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input;
        try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"))) {
            while ((input = br.readLine()) != null) {
                out.println(input);
            }
        } catch (IOException e) {
            ;
        }
    }
}
