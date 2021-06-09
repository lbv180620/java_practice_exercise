import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList[][] arraylist1 = new ArrayList[3][3];

    arraylist1[0][0] = new ArrayList<String>();
    arraylist1[0][0].add("One");
    arraylist1[0][0].add("Two");
    arraylist1[0][0].add("Three");

    arraylist1[0][1] = new ArrayList<String>();
    arraylist1[0][1].add("One");
    arraylist1[0][1].add("Two");
    arraylist1[0][1].add("Three");

    arraylist1[0][2] = new ArrayList<String>();
    arraylist1[0][2].add("One");
    arraylist1[0][2].add("Two");
    arraylist1[0][2].add("Three");

    out.println(Arrays.deepToString(arraylist1));

  }
}
