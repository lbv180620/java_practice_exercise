import java.util.*;

public class Search {
    public static String linerSearch(int code, Integer[] codes, String[] names) {
        int n = codes.length;
        int key = -1;
        for (int i = 0; i < n; i++) {
            if (code == (int) codes[i]) {
                key = i;
            }
        }
        if (key == -1) {
            return "入力された社員番号は存在しません\n";
        }
        return String.format("社員番号: %d -> 社員名: %s\n", code, names[key]);
    }
}
