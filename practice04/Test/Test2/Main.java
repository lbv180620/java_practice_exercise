import static java.lang.System.*;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    out.print("半角数字入力: ");
    String input = br.readLine();
    while (!(input.matches("\\d+"))) {
      out.print("やり直して下さい: ");
      input = br.readLine();
    }
    StringBuilder sb = new StringBuilder(input);
    for (int i = 0; i < sb.length(); i++) {
      int charInt = (int) sb.charAt(i);
      if (charInt >= 0x30 && charInt <= 0x39) {
        sb.setCharAt(i, (char) (charInt + 0xFEE0));
      }
    }
    input = sb.toString();
    out.println("全角数字: " + input);
  }
}
