import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("数値入力: ");
      int x = Integer.valueOf(br.readLine());
      for (int i = 1; i < 4; i++) {
        out.println((int) Math.pow(x, i));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
