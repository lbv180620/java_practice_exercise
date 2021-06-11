import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] ary = { 8, 2, 7, 6, 3, 1, 4, 9, 5 };
    quickSort(ary);
    out.println(Arrays.toString(ary));
  }

  public static int[] quickSort(int[] ary) {
    quick(ary, 0, ary.length - 1);
    return ary;
  }

  private static void quick(int[] ary, int left, int right) {
    int l = left;
    int r = right;
    int tmp;
    int pivot = ary[(l + r) / 2];

    if (left >= right) {
      return;
    }
    while (l <= r) {
      while (ary[l] < pivot) {
        l++;
      }
      while (ary[r] > pivot) {
        r--;
      }
      if (l <= r) {
        tmp = ary[l];
        ary[l] = ary[r];
        ary[r] = tmp;
        l++;
        r--;
      }
    }
    quick(ary, left, r);
    quick(ary, l, right);
  }
}
