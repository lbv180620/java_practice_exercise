import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        int count = 1;
        int strike = 0;
        int ball = 0;
        while (strike < 3 && ball < 8) {
            out.printf("%d球目: ストライク=1 or ボール=2 ? ", count);
            String input = br.readLine();
            while (!(input.matches("[12]"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            int num = Integer.valueOf(input);
            switch (num) {
                case 1:
                    strike += num;
                    break;
                case 2:
                    ball += num;
                    break;
            }
            out.println(strike);
            out.println(ball);
            count++;
        }
        out.printf("%dボール、%dストライク\n", ball / 2, strike);
    }
}

// ストライク = 1
// ボール 2
// ストライクの合計 = 3 -> ループ終了
// ボールの合計 = 8 -> ループ終了
