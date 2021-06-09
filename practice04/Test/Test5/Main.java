import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String[]> list = new ArrayList<String[]>();
    list.add(0, new String[2]);
    list.get(0)[0] = "One";
    list.get(0)[1] = "Two";

    list.add(1, new String[] { "Three", "Four" });

    out.println(list.get(0)[0]);
  }
}
