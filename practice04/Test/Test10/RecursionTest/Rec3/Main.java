import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        out.println("fibo(5) = " + fibo(5));
    }

    public static int fibo(int n) {
        out.printf("fibo(%d)\n", n);
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }
}

// f(3) = f(2) + ff(1)
// f(2) = f(1) + ff(0)
// f(1) = 1
// ff(0) = 0 -> f(2) = 1
// ff(1) = 1 -> f(3) = 2

// f(5) = f(4) + ff(3)
// f(4) = f(3) + ff(2)
// f(3) = f(2) + ff(1)
// f(2) = f(1) + ff(0)
// f(1) = 1
// ---------------
// ff(0) = 0 -> f(2) = 1
// -----------------
// ff(1) = 1 -> f(3) = 2
// ff(2) = f(1) + ff(0)
// f(1) = 1
// ff(0) = 0 -> ff(2) = 1, f(4) = 3
// ff(3) = f(2) + ff(1)
// f(2) = f(1) + ff(0)
// f(1) = 1
// ff(0) = 0
// ff(1) = 1 ff(3) = 2 f(5) = 5
