import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long v = factorial(i);
            out.println(i + "の階乗は" + v);
        }
    }

    public static long factorial(int n) { // 分岐しない再帰関数
        if (n == 1) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }
}

// n=5
// 5 * f(4)
// 5 * 4 * f(3)
// 5 * 4 * 3 * f(2)
// 5 * 4 * 3 * 2 f(1)
// 5 * 4 * 3 * 2 * 1 -> 戻り値
