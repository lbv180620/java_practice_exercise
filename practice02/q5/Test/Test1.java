import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Test1 {
  public static void main(String[] args) {
    long start = currentTimeMillis();

    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    out.println(sum);

    long end = currentTimeMillis();

    Date d = new Date(end - start);

    out.println("処理時間: " + d);

    out.println(d.getTime());
    d.setTime(4294024L);
    out.println(d);

    out.println("--------------------");

    Date now = new Date();
    out.println(now);
    out.println(now.getTime());
    Date now2 = new Date(currentTimeMillis());
    out.println(now2);

  }
}
