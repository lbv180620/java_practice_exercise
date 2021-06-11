import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] ary = { 8, 2, 7, 6, 3, 1, 4, 9, 5 };
    quickSort(ary, 0, ary.length - 1);
    out.println(Arrays.toString(ary));
  }

  public static void quickSort(int[] ary, int left, int right) {
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
      quickSort(ary, left, r);
      quickSort(ary, l, right);
    }
  }
  // 8 2 7 6 5 1 4 3r 9pl | 9 | 9 |
  // 0 1 2 3 4 5 6 7 8
  // left=0
  // right=8
  // l=0 1 2 3 4 | 5 6 7 8
  // r=8 | 7
  // p=9
  // ------------------------------
  // 3 2 4 1 5lr 6 7 8 9 | 6 | 6 |
  // 0 1 2 3 4 5 6 7 8
  // left=0 | 1 2 | 3 | 4
  // right=7 | 6 | 5 | 4
  // l=0
  // r=7
  // p=3
  //
  // 8p 2 7 6 5 1 4 3 9lr | 8 | |
  //
  // left=8
  // right=8
  // l=8
  // r=8
  // p=0
  // --------------------------------

}
