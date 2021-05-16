import java.util.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(in);
    out.print("任意の数値入力: ");
    int x = scan.nextInt();
    for (int i = 2; i < 5; i++) {
      out.println(x * i);
    }
  }
}
