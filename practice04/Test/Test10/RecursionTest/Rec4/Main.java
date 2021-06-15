import static java.lang.System.*;
import java.util.*;

public class Main {

    static final int MAX_FIBO = 5;
    static long[] memo = new long[MAX_FIBO + 1];

    public static void main(String[] args) {
        Arrays.fill(memo, -1L);
        out.println("fibo(5) = " + fibo(5));
        out.println(Arrays.toString(memo));
    }

    static long fibo(int n) {
        if (memo[n] != -1L) {
            return memo[n];
        }
        out.printf("fibo(%d)\n", n);

        if (n < 2) {
            memo[n] = n;
        } else {
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }

        return memo[n];
    }
}
