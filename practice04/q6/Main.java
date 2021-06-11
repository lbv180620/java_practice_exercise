import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] ary = new int[Integer.valueOf(args[0])];

    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    Map<String, int[]> map = new LinkedHashMap<>();
    map.put("バブルソート", Sort.bubbleSort(ary));
    map.put("選択ソート", Sort.selectionSort(ary));
    map.put("挿入ソート", Sort.insertionSort(ary));
    map.put("クイックソート", Sort.quickSort(ary));

    for (String key : map.keySet()) {
      for (int i = 0; i < ary.length; i++) {
        out.print("自然数を入力: ");
        String input = br.readLine();
        while (!(input.matches("[0-9]|[1-9][0-9]+"))) {
          out.print("入力し直して下さい: ");
          input = br.readLine();
        }
        ary[i] = Integer.valueOf(input);
      }
      out.println(Arrays.toString(ary));
      out.println("---------------");

      out.printf("~~%s~~\n", key);
      long start = currentTimeMillis();
      int max = map.get(key)[map.get(key).length - 1];
      long end = currentTimeMillis();
      out.printf("最大値は%d\n", max);
      out.println("処理時間は" + (end - start) + "ミリ秒");

      out.println("---------------");
    }
  }
}
