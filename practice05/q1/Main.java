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
        out.println(list);

        for (int e : list) {
            out.println(e * 2);
        }

        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        // int e = it.next();
        // out.println(e * 2);
        // }

    }
}
