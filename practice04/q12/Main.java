import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.print("素数かどうか判定します。数値を入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("0|-?([1-9]|[1-9][0-9]+)"))) {
            out.print("入力し直して下さい: ");
            input = br.readLine();
        }
        int num = Integer.valueOf(input);

        out.println("-----------------");
        out.println("素数判定を行ます。");
        primalityTest(num);
        out.println("-----------------");
        out.println("エラトステネスの篩");
        sieve_of_Eratosthenes(num);
    }

    public static void primalityTest(int num) {
        if (num < 2) {
            out.printf("%dは素数ではありません。\n", num);
            return;
        }

        if (num == 2) {
            out.printf("%dは素数です。\n", num);
            return;
        }

        if (num % 2 == 0) {
            out.printf("%dは素数ではありません。\n", num);
            return;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) { // 2ずつ増えれば偶数を省ける。奇数 + 偶数 = 奇数
            if (num % i == 0) {
                out.printf("%dは素数ではありません。\n", num);
                return;
            }
        }
        out.printf("%dは素数です。\n", num);
    }

    public static void sieve_of_Eratosthenes(int num) {
        int[] prime_nums = { 2, 3, 5, 7 };

        if (num > 100) {
            out.println("数が100より大きいので、判定不能です。");
            return;
        }

        if (num < 2) {
            out.printf("%dは素数ではありません。\n", num);
            return;
        }

        for (int prime_num : prime_nums) {
            switch (num % prime_num) {
                case 0:
                    out.printf("%dは素数ではありません。\n", num);
                    return;
                default:
                    break;
            }
        }
        out.printf("%dは素数です。\n", num);
    }
}

// 素数：1と自分以外に約数を持たない数、合成数ではない数
// つまり、自分以外で割り切れたらダメ
// 偶数は2を除いて素数にはならない
// エラトステネスの篩：100までなら、素数7まで調べれば、100までの中での素数を特定できる。
// 合成数nは√n以下の約数をもつ
// 合成数は1と自分自身以外にも少なともひとつ約数を持つので、合成数nは自然数a,bより n = a * b と表せる。
// 合成数n(>0)が√n以下の約数を持たないとすると、a>√n(>0), b>√n(>0) となるが、この場合 ab > √n*√n = n
// となり矛盾する。
// つまり、nが合成数ならば、√n以下の約数を持つので、√n以下に約数が無ければ、合成数ではなく素数ということ。
