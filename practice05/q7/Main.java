import static java.lang.System.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[][] ary = new Integer[3][3];

        int x = 1;
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = x;
                x++;
            }
        }
        out.println(Arrays.deepToString(ary));

        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                out.print(ary[i][j] + " ");
            }
            out.println("");
        }
    }
}
