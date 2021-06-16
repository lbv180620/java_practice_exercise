import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 7, 2, 6, 4, 3, 8, 5, 1 };
        ary = mergeSort(ary);
        out.println(Arrays.toString(ary));
    }

    private static int[] mergeSort(int[] ary) {
        int n = ary.length;

        if (n <= 1) {
            out.println("ary" + Arrays.toString(ary));
            return ary;
        }
        int m = n / 2;

        int[] L = new int[n - m]; // mよりも前半部分を格納
        int[] R = new int[m]; // mよりも後半部分を格納

        System.arraycopy(ary, 0, L, 0, n - m);
        System.arraycopy(ary, n - m, R, 0, m);

        out.println("ary" + Arrays.toString(ary));
        out.println("L" + Arrays.toString(L));
        out.println("-----------------");
        mergeSort(L);
        out.println("-----------------");
        out.println("ary" + Arrays.toString(ary));
        out.println("R" + Arrays.toString(R));
        out.println("------------------");
        mergeSort(R);

        List<Integer> newAry = new ArrayList<>();

        int nL = L.length;
        int nR = R.length;

        out.println("------------------");
        out.println("ary" + Arrays.toString(ary));
        out.println("L" + Arrays.toString(L));
        out.println("R" + Arrays.toString(R));

        int i = 0;
        int j = 0;
        while (i < nL && j < nR) {
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

        out.println("newAry" + newAry);

        while (i < nL) {
            newAry.add(L[i]);
            i++;
        }

        while (j < nR) {
            newAry.add(R[j]);
            j++;
        }
        out.println("newAry" + newAry);

        for (int k = 0; k < n; k++) {
            ary[k] = newAry.get(k);
        }

        out.println("ary" + Arrays.toString(ary));
        out.println("------------------");

        return ary;
    }
}

// {7} {2} {6 4} {3 8 5 1}
// 0 1 2 3 4 5 6 7
// n=8
// m=4
// L[4]
// R[4]
