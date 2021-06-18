import static java.lang.System.*;
import java.util.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.print("個数を入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("([0-9]|[1-9][0-9]+|[０-９]|[１-９][０-９]+)個?"))) { // 漢数字を半角数字に変換する方法は？
            out.print("やり直して下さい: ");
            input = br.readLine();
        }
        if (input.matches(".*個")) {
            input = input.replaceAll("個", "");
        }
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 0xFF10 && c <= 0xFF19) {
                sb.setCharAt(i, (char) (c - 0xFEE0));
            }
        }
        input = sb.toString();
        int inputInt = Integer.valueOf(input);
        for (int i = 0; i < inputInt; i++) {
            out.println("＊");
        }
    }
}
