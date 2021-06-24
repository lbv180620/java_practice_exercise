import static java.lang.System.*;

import java.util.*;
import static java.util.Map.*;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        CoinCase cc = new CoinCase();
        List<Integer> type_list = new ArrayList<>(Arrays.asList(1, 5, 10, 50, 100, 500));

        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(type_list.size());
            int count = new Random().nextInt(10) + 1;
            cc.addCoins(type_list.get(index), count);
        }

        type_list.forEach(e -> out.printf("%d円玉: 計%d枚, 計%d円\n", e, cc.getCount(e), cc.getAmount(e)));
        out.println("");
        out.printf("総枚数: %d枚\n", cc.getCount());
        out.println("");
        out.printf("総額: %d円\n", cc.getAmount());
    }

}
