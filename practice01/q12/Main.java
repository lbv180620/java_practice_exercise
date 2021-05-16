import java.util.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    out.print("任意の数値入力: ");
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();

    for (int i = 0; i < 9; i++) {
      out.println(x++);
    }
    out.println("---------------");
    for (int i = 0; i < 9; i++) {
      out.println(y--);
    }
    out.println("---------------");
    for (int i = 0; i < 9; i++) {
      out.println(++z);
    }
  }
}
