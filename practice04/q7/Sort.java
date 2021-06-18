import java.util.*;
import static java.lang.System.*;

public class Sort {
    public static int[] bubbleSort(int[] ary) { // 隣同士を大小比較して交換していく
        int tmp;
        for (int s = ary.length - 1; s > 0; s--) { // 最後尾の要素が確定したら、要素数をひとつ減らす
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

    // 1 {2 3 4 5} | 5 |
    // 0 1 2 3 4
    // s=4 3 2 1 0
    // k=0 1 2 3 4 0 1 2 3 0 1 2 0 1

    public static int[] selectionSort(int[] ary) { // 最小値を選択していく
        int tmp;
        for (int s = 0; s < ary.length - 1; s++) { // 配列が左から確定するバ場合はインクリメント、右から確定していく場合はデクリメントで考える
            int min = s;
            for (int k = s + 1; k < ary.length; k++) { // ary.length == 5
                if (ary[min] > ary[k]) {
                    min = k;
                }
            }
            if (s != min) {
                tmp = ary[min]; // 最大値を選択していく場合は、0 -> ary.length - 1
                ary[min] = ary[s];
                ary[s] = tmp;
            }
        }
        return ary;
    }

    // {1 2} 5 4 3 | |
    // 0 1s 2 3 4km
    // s=0 1
    // k=1 2 3 4 5 2 3 4
    // min=0 1

    public static int[] insertionSort(int[] ary) {
        int tmp;
        for (int s = 1; s < ary.length; s++) {
            tmp = ary[s];
            int k;
            for (k = s - 1; k >= 0; k--) {
                if (ary[k] > tmp) {
                    ary[k + 1] = ary[k];
                } else {
                    break;
                }
            }
            ary[k + 1] = tmp; // 挿入
        }
        return ary;
    }

    // 1 2 3 4 5 | 2 |
    // 0k 1 2 3 4s
    // s=1 2 3 4
    // k=0 -1 1 2 1 0 -1 3 2 1 0

    public static int[] quickSort(int[] ary) {
        quick(ary, 0, ary.length - 1);
        return ary;
    }

    private static void quick(int[] ary, int left, int right) {
        int tmp;
        int l = left;
        int r = right;
        int pivot = ary[(left + right) / 2];

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

    // 4 3 5 1 2 | | |
    // 0 1 2 3 4
    // left=0
    // right=4
    // l=0
    // r=4

    public static int[] mergeSort(int[] ary) {
        return ary;
    }

    public static int[] shellSort(int[] ary) {
        return ary;
    }

    public static int[] heapSort(int[] ary) {
        int n = ary.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(ary, n, i);
        }

        for (int j = n - 1; j >= 0; j--) { // 最後尾の要素が確定したので、要素数をひとつ減らす
            int tmp = ary[0];
            ary[0] = ary[j];
            ary[j] = tmp;
            heap(ary, j, 0);
        }
        return ary;
    }

    public static void heap(int[] ary, int n, int root) {
        int largest = root;
        int l = 2 * root + 1;
        int r = 2 * root + 2;

        if (l < n && ary[l] > ary[largest]) {
            largest = l;
        }
        if (r < n && ary[r] > ary[largest]) {
            largest = r;
        }

        if (largest != root) {
            int swp = ary[root];
            ary[root] = ary[largest];
            ary[largest] = swp;
            heap(ary, n, largest);
        }

    }

}
