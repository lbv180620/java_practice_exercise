import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    out.print("任意の数値入力: ");
    int x = scan.nextInt();

    // for (int i = 1; i < 4; i++) {
    // out.println((int) Math.pow(x, i));
    // }

    for (int i = 1; i < 4; i++) {
      out.println(power(x, i));
    }
  }

  public static int power(int rad, int ind) {
    int result = 1;
    for (int i = 0; i < ind; i++) {
      result *= rad;
    }
    return result;
  }
}
