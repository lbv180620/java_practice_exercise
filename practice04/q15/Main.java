import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String input;
        int count = 1;
        int sum = 0;

        do {
            out.printf("%d.数値を入力して下さい: ", count);
            input = br.readLine();
            while (!(input.matches("0|-?([1-9]|[1-9][0-9]+)"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            int num = Integer.valueOf(input);
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        } while (true);
        out.printf("合計: %d\n", sum);
    }
}
