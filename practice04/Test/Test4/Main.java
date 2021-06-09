import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList[] list = new ArrayList[3];
    for (int i = 0; i < list.length; i++) {
      list[i] = new ArrayList<String>();
    }
    list[1].add("apple");
    out.println(Arrays.deepToString(list));
  }
}
