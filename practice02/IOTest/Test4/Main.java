import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try {
      char[] cbuf = new char[1];
      FileReader fr = new FileReader("hello.txt");

      while ((fr.read(cbuf)) != -1) {
        out.print("[");
        out.print(cbuf);
        out.println("]");
      }
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
