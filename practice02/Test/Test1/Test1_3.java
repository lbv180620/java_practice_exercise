import static java.lang.System.*;
import java.util.*;
import java.io.*;

// public class Test1_3 {
//   public static void main(String[] args) throws IOException {
//     int c;
//     while ((c = in.read()) != -1) {
//       out.println((char) c);
//     }
//   }
// }

public class Test1_3 {
  public static void main(String[] args) {
    int c;
    try {
      while ((c = in.read()) != -1) {
        out.print((char) c);
      }
      out.println("");
    } catch (IOException e) {
      out.println(e.getMessage());
    }
  }
}
