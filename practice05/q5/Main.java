import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        int[] ary = new int[10];
        int[] copied = new int[ary.length];

        Map<String, String> map = new LinkedHashMap<>();
        map.put("バブルソート", "babbleSort");
        map.put("選択ソート", "selectionSort");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in));) {

            for (int i = 0; i < ary.length; i++) {
                out.print((i + 1) + ". 数値を入力して下さい: ");
                String input = br.readLine();
                while (!(input.matches("0|-?([1-9]|[1-9][0-9]+)"))) {
                    out.print("入力し直して下さい: ");
                    input = br.readLine();
                }
                int n = Integer.valueOf(input);
                ary[i] = n;
            }

            Class<? extends Sort> c = Sort.class;
            Method m;

            for (String key : map.keySet()) {
                out.printf("===%s===\n", key);
                System.arraycopy(ary, 0, copied, 0, ary.length);
                out.println("ソート前の配列: " + Arrays.toString(copied));
                m = c.getMethod(map.get(key), int[].class);
                m.invoke(null, copied);
                out.println("ソート後の配列: " + Arrays.toString(copied));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }

    }
}
