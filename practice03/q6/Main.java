import java.util.*;

import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    out.print("数値入力: ");
    int num = Integer.valueOf(br.readLine());

    if (num >= 0) {
      switch (num % 2) {
        case 0:
          out.printf("%dは正の偶数\n", num);
          break;
        default:
          out.printf("%dは正の奇数\n", num);
          break;
      }
    } else {
      switch (num % 2) {
        case 0:
          out.printf("%dは負の偶数\n", num);
          break;
        default:
          out.printf("%dは負の奇数\n", num);
          break;
      }
    }
  }
}
