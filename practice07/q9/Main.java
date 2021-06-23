import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        out.println(obj.factorial(Integer.valueOf(args[0])));
    }
}

class Calc {
    public long factorial(int n) {
        if (n < 2) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }
}
