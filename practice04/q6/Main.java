import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] nums = new int[10];

    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    for (int i = 0; i < 10; i++) {
      out.print("自然数を入力: ");
      String input = br.readLine();
      while (!(input.matches("[0-9]|[1-9][0-9]+"))) {
        out.print("入力し直して下さい: ");
        input = br.readLine();
      }
      nums[i] = Integer.valueOf(input);
    }
  }

  public static int sort() {
    return 0;
  }
}
