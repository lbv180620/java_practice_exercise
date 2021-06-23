import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.primeRangeToList(10000, 10100).stream().forEach(x -> out.println(x));
        out.println("------------------------");
        obj.primeRangeToList(0, 100).stream().forEach(x -> out.println(x));
    }
}

class Calc {

    public List<Integer> primeRangeToList(int x, int y) {
        List<Integer> primes = new ArrayList<>();
        for (int i = x; i < y; i++) {
            if (this.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
