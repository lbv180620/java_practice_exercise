import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    String[] month = { "01", "24", "87", "1", "2", "3", "10", "11", "12" };
    for (String m : month) {
      out.printf("%s = %b\n", m, isMaches(m));
    }

  }

  public static boolean isMaches(String str) {
    return str.matches("[1-9]|1[0-2]");
  }
}
