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
            int k;
            for (k = s - 1; k >= 0 && ary[k] > tmp; k--) {
                ary[k + 1] = ary[k];
            }
            ary[k + 1] = tmp;
        }
        return ary;
    }
    // 1 2k 3 4 5s : 3
    // s=1 2 3 4
    // k=0 1 0 -1 2 3 2 1

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

    public static int[] shellSort(int[] ary) {
        int n = ary.length;
        int s, k, tmp;
        int h = 1;

        while (h <= n / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
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

    public static int[] mergeSort(int[] ary) {
        return ary;
    }
}

// publicなメソッド
// フィールド、コンストラクタは無し
