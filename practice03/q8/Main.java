import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    out.print("点数入力: ");
    int score = Integer.valueOf(br.readLine());
    while (score < 0 || score > 100) {
      out.println("エラーです。");
      out.println("正しい点数を入力して下さい。");
      score = Integer.valueOf(br.readLine());
    }

    out.println("---------------");
    case1(score);
    out.println("---------------");
    case2(score);
    out.println("---------------");
    case3(score);
  }

  public static void case1(int score) {
    String result = score >= 60 ? "合格" : "不合格";
    out.println(result);
  }

  public static void case2(int score) {
    if (score >= 80) {
      out.println("たいへんよくできました");
    } else if (score >= 60 && score < 80) {
      out.println("よくできました");
    } else {
      out.println("ざんねんでした");
    }
  }

  public static void case3(int score) {
    if (score >= 80) {
      out.println("優");
    } else if (score >= 70 && score < 80) {
      out.println("良");
    } else if (score >= 60 && score < 70) {
      out.println("可");
    } else {
      out.println("不可");
    }
  }
}
