import static java.lang.System.*;
import java.util.*;

public class Main {
    static final int MAX_FIBO = 50;
    static long[] memo = new long[MAX_FIBO + 1];

    public static void main(String[] args) {
        Arrays.fill(memo, -1L);
        fibo(MAX_FIBO);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < memo.length; i++) {
            if (memo[i] > 1000) {
                sb.delete(sb.length() - 2, sb.length() - 1);
                break;
            }
            sb.append(String.valueOf(memo[i]) + ", ");
        }
        out.println(sb.toString());
    }

    public static long fibo(int n) {
        if (memo[n] != -1L) {
            return memo[n]; // すでに確定している項は飛ばす
        }

        if (n < 2) {
            memo[n] = n;
        } else {
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }
        return memo[n];
    }

}

// f(0) = 0, f(1) = 1
// f(n) = f(n-1) + f(n -2) n>=2

// 0 1 1 2 3 n=4
// 0 1 2 3 4
// m(4) = 2 + 1 = 3
// m(3) = 1 + 1 = 2
// m(2) = 1 + 0 = 1
// m(1) = 1
// m(0) = 0
// m(2) = 1
