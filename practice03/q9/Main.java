import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    out.print("中間試験の点数入力: ");
    int midTermExamScore = Integer.valueOf(br.readLine());
    while (midTermExamScore < 0 || midTermExamScore > 100) {
      out.print("正しい点数を入力して下さい: ");
      midTermExamScore = Integer.valueOf(br.readLine());
    }

    out.print("期末試験の点数入力: ");
    int finalExamScore = Integer.valueOf(br.readLine());
    while (finalExamScore < 0 || finalExamScore > 100) {
      out.print("正しい点数を入力して下さい: ");
      finalExamScore = Integer.valueOf(br.readLine());
    }

    eval(midTermExamScore, finalExamScore);
  }

  public static void eval(int midTermExamScore, int finalExamScore) {
    int sum = midTermExamScore + finalExamScore;
    if (midTermExamScore >= 0 && finalExamScore >= 60) {
      out.println("合格");
    } else if (sum >= 130) {
      out.println("合格");
    } else if (sum >= 100 && (midTermExamScore >= 90 || finalExamScore >= 90)) {
      out.println("合格");
    } else {
      out.println("不合格");
    }
  }
}
