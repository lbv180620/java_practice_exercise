import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> codes = new ArrayList<>(
                Arrays.asList(1001, 1002, 1005, 1010, 1012, 1013, 1015, 1020, 1021, 1022));

        List<String> names = new ArrayList<>(Arrays.asList("鈴木", "井上", "山本", "田川", "田中", "松田", "木下", "上野", "岡本", "吉永"));

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.print("社員番号を入力して下さい: ");
        String input = br.readLine();
        while (!(input.matches("\\d{4}"))) {
            out.print("入力し直して下さい: ");
            input = br.readLine();
        }
        int code = Integer.valueOf(input);

        String result = Search.linerSearch(code, codes.toArray(new Integer[codes.size()]),
                names.toArray(new String[names.size()]));
        out.print(result);

        // codes.add(1023);
        // names.add("佐藤");
        // code = 1023;
        // result = Search.linerSearch(code, codes.toArray(new Integer[codes.size()]),
        // names.toArray(new String[names.size()]));
        // out.print(result);

    }
}

// 線形探索
// 二分探索
// ハッシュ探索
