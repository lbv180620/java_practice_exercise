import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int n = i * j;
                String s = (j == 9) ? n + "\n\n" : n + "            ";
                out.print(s);
            }
        }
    }
}
