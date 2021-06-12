import static java.lang.System.*;
import java.util.*;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 2, 3 };
        Class<?> c = Ary.class;
        Method m = c.getMethod("getAry", int[].class);
        int[] nums2 = (int[]) m.invoke(new Ary(), nums);
        for (int num : nums2) {
            out.println(num);
        }
    }
}

class Ary {
    public int[] getAry(int[] ary) {
        return ary;
    }
}
