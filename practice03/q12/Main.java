import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String monthString = inputMonth();
    int monthInt = convInt(monthString);
    printPub(monthInt);
  }

  public static String inputMonth() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    out.println("このプログラムは指定された月の祝日を表示します");
    out.print("月を指定して下さい: ");
    String str = br.readLine();
    while (!(str.matches("([1-9１-９]|1[０-２]|１[０-２]|[一二三四五六七八九十]|十[一二])月?"))) {
      out.print("やり直して下さい: ");
      str = br.readLine();
    }
    return str;
  }

  public static int convInt(String str) {
    if (str.matches("([1-9１-９]|1[0-2]|１[０-２]|[一二三四五六七八九十]|十[一二])月")) {
      str = str.replaceAll("月", "");
    }

    int num = 0;
    switch (str) {
      case "1":
      case "１":
      case "一":
        num = 1;
        break;
      case "2":
      case "２":
      case "二":
        num = 2;
        break;
      case "3":
      case "３":
      case "三":
        num = 3;
        break;
      case "4":
      case "４":
      case "四":
        num = 4;
        break;
      case "5":
      case "５":
      case "五":
        num = 5;
        break;
      case "6":
      case "６":
      case "六":
        num = 6;
        break;
      case "7":
      case "７":
      case "七":
        num = 7;
        break;
      case "8":
      case "８":
      case "八":
        num = 8;
        break;
      case "9":
      case "９":
      case "九":
        num = 9;
        break;
      case "10":
      case "１０":
      case "十":
        num = 10;
        break;
      case "11":
      case "１１":
      case "十一":
        num = 11;
        break;
      case "12":
      case "１２":
      case "十二":
        num = 12;
        break;
      default:
        break;
    }
    return num;
  }

  public static void printPub(int num) {
    switch (num) {
      case 1:
        out.printf("%d月: 元旦、成人の日\n", num);
        break;
      case 2:
        out.printf("%d月: 建国記念の日、天皇誕生日\n", num);
        break;
      case 3:
        out.printf("%d月: 春分の日\n", num);
        break;
      case 4:
        out.printf("%d月: 昭和の日\n", num);
        break;
      case 5:
        out.printf("%d月: 憲法記念日、みどりの日、こどもの日\n", num);
        break;
      case 7:
        out.printf("%d月: 海の日\n", num);
        break;
      case 8:
        out.printf("%d月: 山の日\n", num);
        break;
      case 9:
        out.printf("%d月: 敬老の日、秋分の日\n", num);
        break;
      case 10:
        out.printf("%d月: 体育の日\n", num);
        break;
      case 11:
        out.printf("%d月: 文化の日、勤労感謝の日\n", num);
        break;
      default:
        out.printf("%d月は祝日はありません\n", num);
        break;
    }
  }
}
