import javax.crypto.MacSpi;

import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String input;

        List<Integer> nums = new ArrayList<>();

        do {
            out.print("1〜9までの数値を入力して下さい(0で終了): ");
            input = br.readLine();
            while (!(input.matches("\\d"))) {
                out.print("入力し直して下さい: ");
                input = br.readLine();
            }
            if (input.matches("0"))
                break;
            int num = Integer.valueOf(input);
            nums.add(num);
        } while (true);

        out.println(nums);
        while (nums.contains(2)) {
            nums.remove(nums.indexOf(2));
        }

        out.println(nums);
        nums = nums.stream().filter(n -> n != 3).collect(Collectors.toList());

        out.println(nums);
        List<Integer> set = new ArrayList<>();
        Collections.addAll(set, 5, 6);
        nums.removeAll(set);
        out.println(nums);

        nums.removeIf(n -> n >= 7);
        out.println(nums);

        nums.subList(1, 3).clear();
        out.println(nums);
        // nums.removeRange(0, 2);
        // out.println(nums);

    }
}
