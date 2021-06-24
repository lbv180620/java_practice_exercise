import java.util.*;
import java.util.stream.*;
import static java.util.Map.*;

public class CoinCase {
    private Map<Integer, Integer> coins = new TreeMap(
            ofEntries(entry(1, 0), entry(5, 0), entry(10, 0), entry(50, 0), entry(100, 0), entry(500, 0)));

    public void addCoins(int type, int count) {
        if (!(coins.containsKey(type))) {
            return;
        }
        coins.put(type, coins.get(type) + count);
    }

    public int getCount(int type) {
        if (!(coins.containsKey(type))) {
            return -1;
        }
        return coins.get(type);
    }

    public int getCount() {
        Integer[] sum = { 0 };
        coins.values().stream().forEach(v -> sum[0] += v);
        return sum[0];
    }

    public int getAmount() {
        Integer[] sum = { 0 };
        coins.forEach((k, v) -> sum[0] += k * v);
        return sum[0];
    }

    public int getAmount(int type) {
        if (!(coins.containsKey(type))) {
            return -1;
        }

        return type * coins.get(type);
    }
    // ラムダ式の外側で定義された変数はラムダ式の内側で参照は出来ても、変更は出来ない
    // ローカル変数はスタック領域に確保される。スタック領域の変数は、スコープが変わるとアクセスできない。
    // 配列やオブジェクトは、参照用の変数がスタックに確保され、実体はヒープ領域に確保される。
    // 配列やオブジェクトの変数として見えているのは、ヒープ領域に確保された実体への参照。
    // これはスタックにあるので、参照を変えることは出来ないが、ヒープ領域への参照が確立されているため、実体の変更は可能。

    // 要は、配列sumの変更はできないが、その要素の変更はfinalで無いので可能といこと。
}
