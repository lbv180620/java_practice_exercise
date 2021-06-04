import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("数値入力: ");
      int num = Integer.valueOf(br.readLine());
      while (num < 0) {
        out.println("正の数値を入力して下さい");
        num = Integer.valueOf(br.readLine());
      }

      switch (num % 2) {
        case 0:
          out.printf("%dは偶数です\n", num);
          break;

        default:
          out.printf("%dは奇数です\n", num);
          break;
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
