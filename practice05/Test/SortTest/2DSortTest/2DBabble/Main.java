import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] ary = { { 5, 9, 2 }, { 4, 3, 7 }, { 8, 1, 6 } };
        out.println(Arrays.deepToString(ary));
        Sort1(ary);
        out.println(Arrays.deepToString(ary));
    }

    public static void Sort1(int[][] ary) {
        int tmp;

        for (int s = 0; s < 2; s++) {
            for (int i = s; i < ary.length; i++) {
                babble(ary[i]);
            }
            babble(ary);

            for (int i = 1; i < ary.length; i++) {
                for (int j = i; j < ary.length; j++) {
                    if (ary[s][i] > ary[j][0]) {
                        tmp = ary[s][i];
                        ary[s][i] = ary[j][0];
                        ary[j][0] = tmp;
                    }
                }
            }
        }
    }

    // [s][i] [j][0]
    //
    // [0][1] [2][0]
    // [0][1] [1][0]
    // [0][2] [2][0]
    // [0][2] [1][0]
    //
    // [1][1] [2][0]
    // [1][2] [2][0]
    //
    // s=0 1
    // i=1 2
    // j=2 1 | 1
    // 3-1=2 -> 3-2=1

    public static void babble(int[] ary) {
        for (int i = ary.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    int tmp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = tmp;
                }
            }
        }
    }

    public static void babble(int[][] ary) {
        for (int i = ary.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ary[j][0] > ary[j + 1][0]) {
                    int[] tmp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = tmp;
                }
            }
        }
    }

    // public static void Sort2(int[][] ary) {

    // }
}

// {5 3 8} {2 1 4} {6 9 7}
// {3 5 8} {1 2 4} {6 7 9} 各要素をソート
// {1 2 4} {3 5 8} {6 7 9} 配列をソート
// {1 2 4} {3 5 8} {6 7 9} 大小比較と入換え
// {1 2 3} {4 5 8} {6 7 9}

// {1 2 3} | {4 5 8} {6 7 9}
// {1 2 3} | {4 5 8} {6 7 9}
// {1 2 3} | {4 5 8} {6 7 9}
// {1 2 3} | {4 5 6} {8 7 9}
// {1 2 3} | {4 5 6} | {8 7 9}

// まず内側の配列を各々ソート
// ary[j][0]先頭の要素を比べて配列をソート
// 結果、最小値が入った配列が一番左に来る
// ary[0][1]とary[1][0]、ary[2][0]とを比較、入換え

// 二次元配列を一次元配列にして、それをソートして、再び二次元配列に直すのはどう？

//
