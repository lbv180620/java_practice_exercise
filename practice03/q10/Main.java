import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    out.print("0~9の数字を入力して下さい: ");
    int num = Integer.valueOf(br.readLine());
    while (num < 0 || num > 9) {
      out.print("やり直して下さい: ");
      num = Integer.valueOf(br.readLine());
    }

    String result = (num >= 1 && num <= 3) || (num >= 7 && num <= 9) ? "当たり" : "はずれ";
    out.println(result);
  }
}
