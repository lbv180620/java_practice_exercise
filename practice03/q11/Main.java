import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    String[] sushi = { "まぐろ", "えび", "こはだ", "いか", "サーモン" };
    for (int i = 0; i < sushi.length; i++) {
      out.printf("%d.%s\n", i + 1, sushi[i]);
    }

    out.println("----------------");

    out.print("好きな寿司の数字を入力して下さい: ");
    int num = Integer.valueOf(br.readLine());

    fortuneTelling(num);

  }

  public static void fortuneTelling(int num) {
    switch (num) {
      case 1:
        out.println("大吉");
        break;
      case 2:
        out.println("中吉");
        break;
      case 3:
        out.println("小吉");
        break;
      case 4:
        out.println("末吉");
        break;
      case 5:
        out.println("凶");
        break;
    }
  }
}
