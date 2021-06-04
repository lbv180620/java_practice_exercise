import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      out.printf("%d回目の数値入力: ", i + 1);
      nums.add(i, Integer.valueOf(br.readLine()));
      out.println("-------------");
    }

    out.println("==============================");

    int x = nums.get(0);
    out.println("x = " + x);
    int y = nums.get(1);
    out.println("y = " + y);

    out.println("==============================");

    if (x > y) {
      out.println("xはyより大きい");
    } else if (x < y) {
      out.println("xはyより小さい");
    } else {
      out.println("xとyは等しい");
    }
  }
}
