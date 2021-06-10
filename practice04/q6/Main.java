import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] nums = new int[10];
    int max = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    for (int i = 0; i < 10; i++) {
      out.print("自然数を入力: ");
      String input = br.readLine();
      while (!(input.matches("[0-9]|[1-9][0-9]+"))) {
        out.print("入力し直して下さい: ");
        input = br.readLine();
      }
      nums[i] = Integer.valueOf(input);
    }

    out.println("---------------");

    out.println("~~バブルソート~~");

    nums = Sort.bubbleSort(nums);
    max = nums[nums.length - 1];
    out.printf("最大値は%d\n", max);

    out.println("---------------");

    out.println("~~選択ソート~~");

    nums = Sort.selectionSort(nums);
    max = nums[nums.length - 1];
    out.printf("最大値は%d\n", max);

    out.println("---------------");

    out.println("~~挿入ソート~~");

    nums = Sort.insertionSort(nums);
    max = nums[nums.length - 1];
    out.printf("最大値は%d\n", max);

    out.println("---------------");
  }
}
