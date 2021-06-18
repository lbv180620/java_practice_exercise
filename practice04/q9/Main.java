import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.print("個数を入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("([0-9]|[1-9][0-9]+|[０-９]|[１-９][０-９]+)個?"))) {
            out.print("入力し直して下さい: ");
            input = br.readLine();
        }
        if (input.matches(".*個")) {
            input = input.replaceAll("個", "");
        }
        if (input.matches("[０-９]|[１-９][０-９]")) {
            StringBuilder sb = new StringBuilder(input);
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                sb.setCharAt(i, (char) (c - 0xFFE0));
            }
            input = sb.toString();
        }
        int times = Integer.valueOf(input);
        for (int i = 0; i < times; i++) { // 周期10
            int n = -1;
            switch (i % 10) {
                case 0:
                    n = 0;
                    break;
                case 1:
                    n = 1;
                    break;
                case 2:
                    n = 2;
                    break;
                case 3:
                    n = 3;
                    break;
                case 4:
                    n = 4;
                    break;
                case 5:
                    n = 5;
                    break;
                case 6:
                    n = 6;
                    break;
                case 7:
                    n = 7;
                    break;
                case 8:
                    n = 8;
                    break;
                case 9:
                    n = 9;
                    break;
            }
            out.print(n);
        }
        out.println("");
    }
}
