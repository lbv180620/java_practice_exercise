import static java.lang.System.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int r = new Random().nextInt(100);
            a[i] = r;
        }
        out.println(Arrays.toString(a));

        int tmp = 0;
        for (int i = 0; i < a.length / 2; i++) {
            tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        out.println(Arrays.toString(a));
    }
}
