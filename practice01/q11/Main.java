import java.util.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    out.print("任意の数値入力: ");
    int x = scan.nextInt();

    out.print("任意の数値入力: ");
    int y = scan.nextInt();
    while (x < y) {
      out.print("再度入力: ");
      y = scan.nextInt();
    }

    int quo = x / y;
    int rem = x % y;

    out.printf("商=%d, 余り=%d\n", quo, rem);
  }
}
