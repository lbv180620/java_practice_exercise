import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object[] objAry = { "one", "two", "three" };
        String[] strAry = Arrays.asList(objAry).toArray(new String[objAry.length]);
        for (String str : strAry) {
            out.println(str);
        }
    }
}
