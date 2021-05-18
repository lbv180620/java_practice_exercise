import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try {
      int size;
      char[] cbuf = new char[3];

      InputStreamReader ipsr = new InputStreamReader(new FileInputStream("hello.txt"));

      while ((size = ipsr.read(cbuf)) != -1) {
        out.print(cbuf);
        out.printf("(%d)\n", size);
        Arrays.fill(cbuf, '\0');
      }

      ipsr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
