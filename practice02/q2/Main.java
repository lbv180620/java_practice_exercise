import java.util.*;

import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("数値入力: ");
      int i = Integer.valueOf(br.readLine());
      out.println(i);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
