import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            out.printf("%d.数値を入力して下さい: ", i + 1);
            String input = br.readLine();
            while (!(input.matches("0|-?([1-9]|[1-9][0-9]+)"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            int n = Integer.valueOf(input);
            list.add(n);
        }
        out.println("元の配列: " + list);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int n : list) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        out.println("偶数: " + even);
        out.println("奇数: " + odd);
    }
}
