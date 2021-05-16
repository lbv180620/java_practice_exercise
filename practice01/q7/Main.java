import java.util.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    int[] array = new int[2];

    for (int i = 0; i < 2; i++) {
      out.print("任意の数値を入力: ");
      array[i] = scan.nextInt();
    }

    int x = array[0];
    int y = array[1];
    out.println("x=" + x);
    out.println("y=" + y);

    out.println("xとyを交換");

    int tmp = x;
    x = y;
    y = tmp;
    out.println("x=" + x);
    out.println("y=" + y);

  }
}
