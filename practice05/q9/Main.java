import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String input;

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        do {
            out.print("0〜9までの数値を入力して下さい: ");
            input = br.readLine();
            while (!(input.matches("\\d"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            if (input.matches("0"))
                break;
            Integer num = Integer.valueOf(input);
            switch (num % 2) {
                case 0:
                    even.add(num);
                    break;

                default:
                    odd.add(num);
                    break;
            }
        } while (true);

        insertionSort(even);
        insertionSort(odd);

        out.print("偶数 ");
        for (Integer e : even) {
            out.print(e + " ");
        }
        out.println("");
        out.print("奇数 ");
        for (Integer o : odd) {
            out.print(o + " ");
        }
        out.println("");

    }

    public static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            Integer tmp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && list.get(j) > tmp; j--) {
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, tmp);
        }
    }

    // 4 4 1 3 |2|
    //
}
