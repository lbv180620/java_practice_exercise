import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = (int) Integer.valueOf(args[0]);
        int r = (int) Integer.valueOf(args[1]);
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(r);
            }
        }
        out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out.print(matrix[i][j] + " ");
            }
            out.println("");
        }

        out.println("----------------");

        selectionSort(matrix);
        out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out.print(matrix[i][j] + " ");
            }
            out.println("");
        }

        int max = matrix[matrix.length - 1][matrix.length - 1];
        int min = matrix[0][0];
        out.printf("最大値: %d\n", max);
        out.printf("最小値: %d\n", min);

    }

    public static void selectionSort(int[][] ary) {
        List<Integer> list = new ArrayList<>();

        for (int[] a : ary) {
            for (Integer n : a) {
                list.add(n);
            }
        }

        selection(list);

        int x = 0;
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length; j++) {
                ary[i][j] = (int) list.get(x);
                x++;
            }
        }
    }

    private static void selection(List<Integer> list) {
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
