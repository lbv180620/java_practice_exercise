import static java.lang.System.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.print("サイズを入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("[1-9]|10"))) {
            out.print("入力し直して下さい: ");
            input = br.readLine();
        }
        int size = Integer.valueOf(input);

        out.print("好きな文字をひとつ入力して下さい: ");
        input = br.readLine();
        while (input.matches("\\s")) {
            out.print("空白文字以外で入力し直して下さい: ");
            input = br.readLine();
        }
        char c = input.charAt(0);

        out.println("------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out.print(c);
            }
            out.println("");
        }

    }
}

/**
 * 二重ループは内側のループから考えた方がわかりやすい
 */
