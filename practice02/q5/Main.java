import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("年齢入力: ");
      int age = Integer.valueOf(br.readLine());
      out.printf("生まれてからおよそ%d日経ちました。\n", daysSinceBirth(age));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int daysSinceBirth(int age) {
    return age * 365;
  }
}
