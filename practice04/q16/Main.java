import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        int sum = 0;
        int count = 0;

        do {
            out.printf("%d. 数値を入力して下さい: ", count + 1);
            String input = br.readLine();
            while (!(input.matches("0|-?([1-9]|[1-9][0-9]+)")) || (count == 1 && input.matches("0"))) {
                out.print("やり直して下さい: ");
                input = br.readLine();
            }
            int num = Integer.valueOf(input);
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        } while (true);
        double avg = (double) sum / count;
        out.printf("平均: %.2f\n", avg);
    }
}
