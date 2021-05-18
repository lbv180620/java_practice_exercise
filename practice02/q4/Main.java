import java.util.*;

import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      int[] nums = new int[2];
      for (int i = 0; i < nums.length; i++) {
        out.print("数値入力: ");
        nums[i] = Integer.valueOf(br.readLine());
      }
      int x = nums[0];
      int y = nums[1];
      out.printf("x=%d, y=%d\n", x, y);

      out.println(x + y);
      out.println(x - y);
      out.println((double) x / y);
      out.println(x % y);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
