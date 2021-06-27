import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        out.print("x = ");
        String input = br.readLine();
        int x = Integer.valueOf(input);
        out.print("y = ");
        input = br.readLine();
        int y = Integer.valueOf(input);
        out.print("z = ");
        input = br.readLine();
        int z = Integer.valueOf(input);

        Calc calc = new Calc();
        out.println(calc.maxValue(x, y, z));
        out.println(calc.maxSort(x, y, z));

    }
}

class Calc {
    public int maxValue(int x, int y, int z) {
        int max = this.largerThan(x, y);
        if (max == x) {
            max = largerThan(x, z);
        } else if (max == y) {
            max = largerThan(y, z);
        }
        return max;
    }

    private int largerThan(int x, int y) {
        int larger = 0;
        if (x >= y) {
            larger = x;
        } else {
            larger = y;
        }
        return larger;
    }

    public int maxSort(int x, int y, int z) {
        int[] ary = { x, y, z };
        this.babble(ary);
        return ary[ary.length - 1];
    }

    private void babble(int[] ary) {
        for (int s = ary.length - 1; s >= 0; s--) {
            for (int k = 0; k < s; k++) {
                if (ary[k] > ary[k + 1]) {
                    int tmp = ary[k];
                    ary[k] = ary[k + 1];
                    ary[k + 1] = tmp;
                }
            }
        }
    }
}

// 2 4 1 3
