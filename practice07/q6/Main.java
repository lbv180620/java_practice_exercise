import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.printMultiplicationTable();
    }
}

class Calc {
    public void printMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            out.print(timesTable(i));
        }
    }

    private String timesTable(int t) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append((i * t) + " ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
