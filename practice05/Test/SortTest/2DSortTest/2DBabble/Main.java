import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] ary = { { 5, 9, 2 }, { 4, 3, 7 }, { 8, 1, 6 } };
        Integer[][] ary2 = { { 7, 9, 3, 11 }, { 5, 12, 1, 8 }, { 4, 10, 13, 16 }, { 15, 6, 2, 14 } };
        // int[][] ary = { { 4, 2 }, { 3, 1 } };
        out.println(Arrays.deepToString(ary));
        out.println("--------------------");
        Sort1(ary);
        out.println(Arrays.deepToString(ary));
        out.println("--------------------");
        out.println(Arrays.deepToString(ary2));
        Sort2(ary2);
        out.println(Arrays.deepToString(ary2));
    }

    public static void Sort1(int[][] ary) {
        int tmp;

        for (int s = 0; s < ary.length; s++) {
            if (s == 0) {
                for (int i = s; i < ary.length; i++) {
                    babble(ary[i]);
                }
                out.println(Arrays.deepToString(ary));
                babble(ary);
                out.println(Arrays.deepToString(ary));
                out.println("------------------");
            } else if ((s == ary.length - 1) && (ary[s - 1][s] > ary[s][0])) {
                tmp = ary[s - 1][s];
                ary[s - 1][s] = ary[s][0];
                ary[s][0] = tmp;
                babble(ary[s]);
                return;
            }

            for (int i = 1; i < ary.length; i++) {
                for (int j = s + i; j < ary.length; j++) {
                    if (ary[s][i] > ary[j][0]) {
                        tmp = ary[s][i];
                        ary[s][i] = ary[j][0];
                        ary[j][0] = tmp;
                        out.println(Arrays.deepToString(ary));
                        for (int k = i; k < ary.length; k++) {
                            babble(ary[k]);
                        }
                        out.println(Arrays.deepToString(ary));
                    }
                }
            }
            babble(ary);
            out.println(Arrays.deepToString(ary));
            out.println("-----------------");
        }
    }

    // ごちゃごちゃして気に食わないけど、とりあえず整列できた。2D 3D いけるが、4Dはできない

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

    public static void Sort2(Integer[][] ary) { // こっちの方がシンプルで応用が利く
        List<Integer> list = new ArrayList<>();

        for (Integer[] a : ary) {
            for (Integer n : a) {
                list.add(n);
            }
        }
        out.println(list);
        selectionSort(list);
        out.println(list);

        Integer x = 0;
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length; j++) {
                ary[i][j] = list.get(x);
                x++;
            }
        }
    }

    public static void selectionSort(List<Integer> list) {
        for (Integer i = 0; i < list.size(); i++) {
            Integer min = i;
            Integer j;
            for (j = i + 1; j < list.size(); j++) {
                if (list.get(min) > list.get(j)) {
                    min = j;
                }
            }
            if (min != i) {
                Integer tmp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, tmp);
            }
        }
    }
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
