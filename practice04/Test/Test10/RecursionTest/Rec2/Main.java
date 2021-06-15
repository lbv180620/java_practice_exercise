import static java.lang.System.*;
import java.util.*;

import java.io.*;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        out.print("正の数字を入力してください: ");
        double num = Double.valueOf(br.readLine());
        out.println("---------------");
        out.print("探索回数を入力してください: ");
        int count = Integer.valueOf(br.readLine());

        if (num < 0.0) {
            out.println("負の数が入力されました。");
        } else {
            double sqrt = sqrt(num, 0, num, count);
            out.println(num + "の平方根の近似値は " + sqrt + "です。");
        }
    }

    public static double sqrt(double num, double l, double r, int count) {
        double c = (l + r) / 2.0;
        double c2 = c * c;
        if (count == 0) {
            return c;
        } else if (c2 == num) {
            return c;
        } else if (c2 > num) {
            return sqrt(num, l, c, count - 1);
        } else {
            return sqrt(num, c, r, count - 1);
        }
    }
}

// (1) c=1 c2=1 < 2 1<√2<2 これの2乗と√2の2乗である2の大小を比較
// (2) c=1.5 c2=2.25 > 2 1<√2<1.5<2
// (3) c= 1.25 c2=1.5625 < 2 1<1.25<√2<1.5<2

// √2
// S=2
// x0=1
// x1=(x0 + S/x0)/2 = (1 + 2/1)/2 = 1.5
// x2=(x1 + S/x1)/2 = (1.5 + 2/1.5)/2

// √2 = 1.41421356
// 1 < √2 1^2 < 2
// (0 + 2)/2 = 1

/**
 * 平方根は0から基数の間の数
 * 0と基数の相加平均の2乗と基数の大小比較で、平方根が平均値よりも左か右か同じか特定していく
 *
 */
