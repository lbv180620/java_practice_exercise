import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String input;

        List<List<Integer>> mod = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mod.add(new ArrayList<>());
        }

        do {
            out.print("1〜99までの数値を入力して下さい(0で終了): ");
            input = br.readLine();
            while (!(input.matches("[0-9]|[]1-9][0-9]"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            if (input.matches("0"))
                break;
            Integer num = Integer.valueOf(input);
            switch (num % 10) {
                case 0:
                    mod.get(0).add(num);
                    break;
                case 1:
                    mod.get(1).add(num);
                    break;
                case 2:
                    mod.get(2).add(num);
                    break;
                case 3:
                    mod.get(3).add(num);
                    break;
                case 4:
                    mod.get(4).add(num);
                    break;
                case 5:
                    mod.get(5).add(num);
                    break;
                case 6:
                    mod.get(6).add(num);
                    break;
                case 7:
                    mod.get(7).add(num);
                    break;
                case 8:
                    mod.get(8).add(num);
                    break;
                case 9:
                    mod.get(9).add(num);
                    break;
            }
        } while (true);

        out.println("----------------------");

        for (List<Integer> m : mod) {
            if (m.isEmpty()) {
                continue;
            }
            shellSort(m);
        }

        for (int i = 0; i < mod.size(); i++) {
            out.printf("一の位が%d: ", i);
            if (mod.get(i).isEmpty()) {
                out.println("なし");
                continue;
            }
            for (Integer n : mod.get(i)) {
                out.print(n + " ");
            }
            out.println("");
        }
    }

    public static void shellSort(List<Integer> list) {
        int n = list.size();
        int s, k, tmp;
        int h = 1;

        while (h <= n / 3) { // h = 1, 4, 13, 40, 121, 264, .....
            h = 3 * h + 1; // h = 3 * h + 1
        }

        while (h > 0) {
            for (s = h; s < n; s++) {
                tmp = list.get(s);
                for (k = s - h; k >= 0 && list.get(k) > tmp; k -= h) {
                    list.set(k + h, list.get(k));
                }
                list.set(k + h, tmp);
            }
            h = (h - 1) / 3;
        }

    }

    // 4 1 3 5 2 | 2 |
    // 0 1 2 3 4
    // h=4
    // s=4 5
    // k=

}
