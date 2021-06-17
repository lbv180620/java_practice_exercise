import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 7, 3, 2, 1, 8, 5, 9, 6, 4 };
        out.println(Arrays.toString(ary));
        out.println("--------------------");
        out.println(Arrays.toString(heapSort(ary)));
    }

    public static int[] heapSort(int[] ary) {
        int n = ary.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(ary, n, i); // ヒープ化 初回だけupheap(最後尾のノードの親を最初のルートとするヒープ)
        }

        for (int j = n - 1; j >= 0; j--) {
            if (ary[0] > ary[j]) { // ルートノードの値を配列の最後尾と交換
                int tmp = ary[0];
                ary[0] = ary[j];
                ary[j] = tmp;
                out.println(Arrays.toString(ary));
                out.println("-----------------");
                heap(ary, j, 0); // downheap(ノード0が最初のルートとするヒープ)
            }
        }

        return ary;
    }

    private static void heap(int[] ary, int n, int root) {
        int largest = root; // 親・左子・右子の中で最初は親の値が一番大きいとする
        int l = 2 * root + 1;
        int r = 2 * root + 2;

        if (l < n && ary[l] > ary[largest]) { // 親・左子・右子の中で一番値が大きいインデックスを特定するための処理。 あるノードに子がない場合、l < nではじかれる。
            largest = l;
        }
        if (r < n && ary[r] > ary[largest]) {
            largest = r;
        }

        if (largest != root) { // 親と左子、右子の中で親が一番大きくない場合は、親の値と交換
            int swap = ary[root];
            ary[root] = ary[largest];
            ary[largest] = swap;
            out.println(Arrays.toString(ary));
            heap(ary, n, largest); // 交換したところで、ヒープ構造が崩れた可能性がある。その修正。しかし、ノード7の下には子は無いので処理を抜けることになる。upheap
        }

    }
}

// {1 2 3 4 5 6 7 8 9} |
// 0 | 1 2 | 3 4 | 5 6 | 7 8
// n=8 7 6 5 4 3 2 1 0
// i=3 -> 2 -> 1 -> 0 -> -1
// root=0
// largest =0
// l= /
// r= /
// j=8 7 6 5 4 3 2 1 0 -1
