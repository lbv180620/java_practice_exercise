import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Calc o = new Calc();
        int result = o.average(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        out.println(result);
    }
}

class Calc {
    public int average(int x, int y) {
        return (x + y) / 2;
    }
}
