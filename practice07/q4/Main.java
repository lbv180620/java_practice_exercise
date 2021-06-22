import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Sharp sh = new Sharp();
        sh.triangle(3);
        sh.triangle(4);
        sh.triangle(5);

    }
}

class Sharp {
    public void triangle(int size) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append('?');
            }
            sb.append("\n");
        }
        String s = sb.toString();
        out.println(s);
    }
}
