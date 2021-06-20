import static java.lang.System.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.println("素因数分解を行います。");
        out.print("2以上の数値を入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("[2-9]|[1-9][0-9]+"))) {
            out.print("入力し直して下さい: ");
            input = br.readLine();
        }
        int num = Integer.valueOf(input);

        printPrimeFactorization(num);
    }

    public static void printPrimeFactorization(int num) {
        StringBuilder sb = new StringBuilder();
        int init = num;
        primeFactorization(num, sb);

        String result = sb.toString();
        out.println(init + " = " + result);

    }

    private static void primeFactorization(int num, StringBuilder sb) { // 1500 750 375 125 25 5
        if (isPrime(num)) {
            sb.append(String.valueOf(num));
            return;
        }

        if (num % 2 == 0) {
            num /= 2;
            sb.append("2 * ");
            primeFactorization(num, sb);
            return;
        }

        for (int p = 3;; p += 2) {
            if (!(isPrime(p))) {
                continue;
            }

            if (num % p == 0) {
                num /= p;
                sb.append(String.valueOf(p) + " * ");
                primeFactorization(num, sb);
                return;
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 素因数分解: √n以下の素数で割っていき、割り切れたらその素数を約数に加える
// StringBuilderで連結しよう
// 完全数n=abcとしたら、自然数a,b,cすべてが√n以上であることは無い
// n=ab a<√n, b>√nの場合はn=abとなる場合がある。
