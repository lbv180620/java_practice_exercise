import static java.lang.System.*;
import java.util.*;
import java.util.function.*;
import java.lang.reflect.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        int[] ary = new int[Integer.valueOf(args[0])];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

            Map<String, String> map = new LinkedHashMap<>();
            map.put("バブルソート", "bubbleSort");
            map.put("選択ソート", "selectionSort");
            map.put("挿入ソート", "insertionSort");
            map.put("クイックソート", "quickSort");
            // map.put("シェルソート", "shellSort");
            // map.put("マージソート", "mergeSort");
            // map.put("ヒープソート", "heapSort");

            Class<? extends Sort> c = Sort.class;
            Method m;
            int count = 0;

            for (String key : map.keySet()) {
                for (int i = 0; i < ary.length; i++) {
                    out.print("整数を入力して下さい: ");
                    String input = br.readLine();
                    while (!(input.matches("0|-?[1-9]|-?[1-9][0-9]+"))) { // 正規表現内で" "は空文字
                        out.print("入力し直して下さい: ");
                        input = br.readLine();
                    }
                    int inputInt = Integer.valueOf(input);
                    ary[i] = inputInt;
                }
                out.println(Arrays.toString(ary));
                out.println("-----------------");

                out.printf("~~%s~~\n", key);
                m = c.getMethod(map.get(key), int[].class);
                long start = currentTimeMillis();
                ary = (int[]) m.invoke(null, ary);
                long end = currentTimeMillis();
                out.println(Arrays.toString(ary));
                int max = ary[ary.length - 1];
                int min = ary[0];
                out.printf("最大値は%d、最小値は%d\n", max, min);
                out.println("処理時間は" + (end - start) + "ミリ秒");

                count++;
                String line = (count == map.size()) ? "" : "--------------------";
                out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
