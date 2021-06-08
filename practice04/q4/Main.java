import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    int win = 0;
    int lose = 0;

    for (int i = 0; i < 10; i++) {
      out.printf("%d回目: 0か1の整数値を入力して下さい> \n", i + 1);
      String input = br.readLine();

      while (!(input.matches("[01０１]"))) {
        out.print("入力し直して下さい> ");
        input = br.readLine();
      }

      if (input.matches("[０１]")) {
        StringBuilder sb = new StringBuilder(input);
        int charInt = (int) sb.charAt(0);
        if (charInt == 0xFF10 || charInt == 0xFF11) {
          sb.setCharAt(0, (char) (charInt - 0xFEE0));
        }
        input = sb.toString();
      }
      int inputInt = Integer.valueOf(input);

      switch (inputInt) {
        case 0:
          lose++;
          break;
        case 1:
          win++;
          break;
      }
    }

    out.printf("勝ちの総数 = %d\n負けの総数 = %d\n", win, lose);
  }
}
