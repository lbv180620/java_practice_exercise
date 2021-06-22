import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        List<String> word = new ArrayList<>();

        do {
            out.print("好きな英単語を入力して下さい: ");
            String input = br.readLine();
            if (input.isEmpty()) {
                break;
            }
            while (!(input.matches("[A-za-z]+"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            word.add(input);
        } while (true);

        for (String w : word) {
            out.print(w + " ");
        }
        out.println("");
    }
}

// 文字列をsortしたい
