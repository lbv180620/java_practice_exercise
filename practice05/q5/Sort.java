public class Sort {
    public static void babbleSort(int[] ary) {
        int tmp;
        for (int s = ary.length - 1; s > 0; s--) {
            for (int k = 0; k < s; k++) {
                if (ary[k] > ary[k + 1]) {
                    tmp = ary[k];
                    ary[k] = ary[k + 1];
                    ary[k + 1] = tmp;
                }
            }
        }
        return;
    }

    public static void selectionSort(int[] ary) {
        int tmp;
        for (int s = 0; s < ary.length - 1; s++) {
            int min = s;
            int k;
            for (k = s + 1; k < ary.length; k++) {
                if (ary[min] > ary[k]) {
                    min = k;
                }
            }
            if (s != min) {
                tmp = ary[s];
                ary[s] = ary[min];
                ary[min] = tmp;
            }
        }
        return;
    }

    // 1 4s 5 2m 3k | |
    // 0 1 2 3 4
    // s=
    // min=
    // k=
}
