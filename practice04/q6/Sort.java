public class Sort {
    public static int[] bubbleSort(int[] ary) {
        int tmp = 0;
        for (int s = ary.length - 1; s > 0; s--) {
            for (int k = 0; k < s; k++) {
                if (ary[k] > ary[k + 1]) {
                    tmp = ary[k];
                    ary[k] = ary[k + 1];
                    ary[k + 1] = tmp;
                }
            }
        }
        return ary;
    }
    // 10s 20k 30 40 50 : 30
    // s=4 3 2 1 0
    // k=0 1 2 3 4 0 1 2 3 0 1 2 0 1

    public static int[] selectionSort(int[] ary) {
        int tmp = 0;
        for (int s = 0; s < ary.length - 1; s++) {
            int min = s;
            for (int k = s + 1; k < ary.length; k++) {
                if (ary[min] > ary[k]) {
                    min = k;
                }
            }
            if (s != min) {
                tmp = ary[min];
                ary[min] = ary[s];
                ary[s] = tmp;
            }
        }
        return ary;
    }
    // 10 20 30 40s 50m k: 40
    // s=0 1 2 3
    // min=2 1 2 2 3 3 4
    // k=1 2 3 4 5 2 3 4 5 3 4 5 4 5

    public static int[] insertionSort(int[] ary) {
        int tmp = 0;
        for (int s = 1; s < ary.length; s++) {
            tmp = ary[s];
            int k = 0;
            for (k = s - 1; k >= 0 && ary[k] > tmp; k--) {
                ary[k + 1] = ary[k];
            }
            ary[k + 1] = tmp;
        }
        return ary;
    }
    // 10 20k 30 40 50s : 30
    // s=1 2 3 4 5
    // k=0 1 0 -1 2 1 3 2 1

    public static int[] quickSort(int[] ary) {
        quick(ary, 0, ary.length - 1);
        return ary;
    }

    private static void quick(int[] ary, int left, int right) {
        int tmp;
        int l = left;
        int r = right;
        int pivot = ary[(l + r) / 2];

        if (l >= r) {
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

// publicなメソッド
// フィールド、コンストラクタは無し
