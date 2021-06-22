import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calc o = new Calc();
        int result = o.squared(Integer.valueOf(args[0]));
        out.println(result);
    }
}

class Calc {
    public int squared(int x) {
        return x * x;
    }
}
