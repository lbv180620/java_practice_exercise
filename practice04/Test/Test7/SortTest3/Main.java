import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 2, 6, 4, 7, 9, 5, 1, 8, 3 };
        ary = shellSort(ary);
        out.println(Arrays.toString(ary));
    }

    public static int[] shellSort(int[] ary) {
        int n = ary.length;
        int s, k, tmp;
        int h = 1;
        while (h <= n / 3) { // 間隔hの決定
            h = 3 * h + 1;
        }
        while (h > 0) { // h=1までループ
            for (s = h; s < n; s++) {
                tmp = ary[s];
                for (k = s - h; k >= 0 && ary[k] > tmp; k -= h) {
                    ary[h + k] = ary[k];
                }
                ary[h + k] = tmp;
            }
            h = (h - 1) / 3;
        }
        return ary;
    }
}

// 1 4k 4s 5 3s | 2 |
// 0 1 2 3 4
// h=4 1
// s=4 5 1 2
// k=0 -4 0 1
