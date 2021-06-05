import java.util.*;

import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    Fruits apple = new Fruits("りんご");
    out.print("りんごの値段入力: ");
    apple.setPrice(Integer.valueOf(br.readLine()));

    out.println("------------------");

    Fruits mikan = new Fruits("みかん");
    out.print("みかんの値段入力: ");
    mikan.setPrice(Integer.valueOf(br.readLine()));

    out.println("------------------");

    Supermarket sm = new Supermarket();

    sm.buy(apple, mikan);

    out.println("------------------");

    sm.setOpen(false);
    sm.buy(apple, mikan);

  }
}
