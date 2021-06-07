import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    printDaysOfTheMonth(inputMonth());
  }

  public static String inputMonth() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    out.print("月を表す数値を入力して下さい: ");
    String monthString = br.readLine();
    while (!(monthString.matches("[1-9]|1[0-2]"))) {
      out.print("やり直して下さい: ");
      monthString = br.readLine();
    }
    return monthString;
  }

  public static void printDaysOfTheMonth(String str) {
    if (str.matches("[469]|11")) {
      out.printf("%s月の日数は30日です\n", str);
    } else if (str.matches("[13578]|1[02]")) {
      out.printf("%s月の日数は31日です\n", str);
    } else {
      out.printf("%s月の日数は28日です\n", str);
    }
  }

}
