import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 8, 2, 7, 6, 9, 1, 4, 3, 5 };
        out.println(Arrays.toString(selectionSort(ary)));
        out.println(Arrays.toString(insertionSort(ary)));
    }

    public static int[] bubbleSort(int[] ary) {
        return ary;
    }

    public static int[] selectionSort(int[] ary) {
        int tmp = 0;
        for (int s = 0; s < ary.length - 1; s++) {
            int min = s;
            for (int k = s + 1; k < ary.length; k++) {
                if (ary[min] > ary[k]) {
                    min = k;
                }
            }
            tmp = ary[min];
            ary[min] = ary[s];
            ary[s] = tmp;
        }
        return ary;
    }
    // 1 2sm 7 6 9 8 4 3 5k | 2 | 2
    // 0 1 2 3 4 5 6 7 8
    // s=0 | 1 | ... | 8
    // min=0 1 5 | 1
    // k=1 2 3 4 5 6 7 8 | 2 3 4 5 6 7 8
    // s:ループ回数インデックス、min:比較ソースインデックス、k:比較対象インデックス

    public static int[] insertionSort(int[] ary) {
        int tmp = 0;
        for (int s = 1; s < ary.length; s++) {
            tmp = ary[s];
            for (int k = s - 1; k >= 0; k--) {
                if (ary[k] > tmp) {
                    ary[k + 1] = ary[k];
                    ary[k] = tmp;
                }
            }
        }
        return ary;
    }
    // 2 6k 7 8s 9 1 4 3 5 | 6
    // 0 1 2 3 4 5 6 7 8
    // s= 1 | 2 | 3 | ... | 8
    // k= 0 | 1 0 | 2 1 0 | ... | 7

    public static int[] quickSort(int[] ary) {
        int tmp = 0;
        for (int s) {
            for (int k) {

            }
        }
        return ary;
    }
    // 8 2 7 6 9 1 4 3 5 | 9 ｜
    // 0 1 2 3 4 5 6 7 8
    // s＝
    // left[]
    // right[]
    // pivot=
    // k=
}
