import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    int sum = 0;
    int avg = 0;

    for (int i = 0; i < 10; i++) {
      out.printf("%d回目: 半角数字で正の整数値を入力して下さい> ", i + 1);
      String input = br.readLine();
      while (!(input.matches("\\d+"))) {
        out.print("入力し直して下さい> ");
        input = br.readLine();
      }
      int inputInt = Integer.valueOf(input);
      sum += inputInt;
    }

    out.printf("合計: %d\n", sum);
    out.printf("平均: %d\n", Math.round(sum / 10));
  }
}
