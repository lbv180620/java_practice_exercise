import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 3, 5, 6, 2, 7, 9, 1, 8, 4 };
        ary = mergeSort(ary);
        out.println(Arrays.toString(ary));
    }

    public static int[] mergeSort(int[] ary) {
        divide(ary, 0, ary.length - 1);
        return ary;
    }

    private static void divide(int[] ary, int left, int right) {
        if (left >= right) {
            return;
        }
        int m = (left + right) / 2;
        divide(ary, left, m);
        divide(ary, m + 1, right);
        merge(ary, left, m, right);
    }

    private static void merge(int[] ary, int left, int m, int right) {
        int n1 = m - left + 1; // n1 + n2 = ary.length
        int n2 = right - m;
        int[] L = new int[n1]; // mよりも前半部分を格納
        int[] R = new int[n2]; // mよりも後半部分を格納
    }

}

// 3| 5| 2| 1 |4
// 0 1 2 3 4
// L[3]
// R[2]
// left=0
// right=4
// m=2
