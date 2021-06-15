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

        int n1 = m - left + 1; // n1 + n2 = ary.length
        int n2 = right - m;
        int[] L = new int[n1]; // mよりも前半部分を格納
        int[] R = new int[n2]; // mよりも後半部分を格納

        System.arraycopy(ary, left, L, 0, n1);
        System.arraycopy(ary, right - m, R, 0, n2);

        divide(L, 0, L.length - 1);
        divide(R, 0, R.length - 1);

        List<Integer> newAry = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            int val1 = L[i];
            int val2 = R[j];

            if (val1 <= val2) {
                newAry.add(L[i]);
                i++;
            } else {
                newAry.add(R[j]);
                j++;
            }
        }

        while (i < n1) {
            newAry.add(L[i]);
            i++;
        }

        while (j < n2) {
            newAry.add(R[j]);
            j++;
        }

        for (int k = 0; k < ary.length; k++) {
            ary[k] = newAry.get(k);
        }
    }

    // private static void merge(int[] ary, int left, int m, int right) {

    // }
}

// 4 1 5m 3 2
// 0 1 2 3 4
// left=0
// right=4
// m=2
// L[3]{4 1 5}
// R[2]{3 2}
//
