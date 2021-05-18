import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try {
      int size;
      char[] cbuf = new char[2];
      InputStreamReader isr = new InputStreamReader(new FileInputStream("hello.txt"));
      StringWriter sw = new StringWriter();

      while ((size = isr.read(cbuf)) != -1) {
        sw.write(cbuf, 0, size);
      }
      out.println(sw.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
