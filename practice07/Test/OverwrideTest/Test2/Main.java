import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };
        int[] c = a;

        out.println(a.equals(b)); // ディープコピーはfalse
        out.println(Arrays.equals(a, b));
        out.println(a.equals(c)); // シャロウコピーはtrue
        out.println(Arrays.equals(a, c));

        int[][] d = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] e = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        out.println(Arrays.deepEquals(d, e));

        List<Integer> f = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> g = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        out.println(f.equals(g));

    }
}
