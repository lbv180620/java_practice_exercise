import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        int count = 1;
        int sum = 0;
        while (sum <= 100) {
            out.printf("%d回目: 0~99までの数値を入力して下さい> ", count);
            String input = br.readLine();
            while (!(input.matches("[0-9]|[1-9][0-9]"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            int n = Integer.valueOf(input);
            sum += n;
            count++;
        }
        out.println("合計: " + sum);
    }
}
