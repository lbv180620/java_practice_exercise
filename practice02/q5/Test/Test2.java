import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Test2 {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(2021, 6, 1, 12, 18, 5);
    Date d = c.getTime();
    out.println(d);
    c.set(Calendar.MONTH, 9);
    d = c.getTime();
    out.println(d);

    out.println("-------------");
    c.setTime(d);
    out.println("今月: " + (c.get(Calendar.MONTH) + 1) + "月");

  }
}
