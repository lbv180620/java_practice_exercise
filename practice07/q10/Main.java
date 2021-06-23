import static java.lang.System.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();

        for (int i = 11; i <= 20; i++) {
            out.printf("%d項目: %d\n", i, obj.fibo(i));
        }
    }
}

class Calc {
    private static final int MAX_FIBO = 50;
    private static long[] memo = new long[MAX_FIBO];

    public long fibo(int n) {
        Arrays.fill(memo, -1L);

        if (memo[n] != -1L) {
            return memo[n];
        }

        if (n < 2) {
            memo[n] = n;
        } else {
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }

        return memo[n];
    }
}
