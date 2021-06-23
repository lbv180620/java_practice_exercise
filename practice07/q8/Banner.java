import static java.lang.System.*;
import java.util.*;

public class Banner {
    public static void main(String[] args) {
        String str = args[0];
        char c = args[1].charAt(0);

        Decoration dec = new Decoration();
        String result = dec.enclosure(str, c);
        out.print(result);
    }

}

class Decoration {
    public String enclosure(String s, char c) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        sb.append("\n" + c + " " + s + " " + c + "\n");
        for (int i = 0; i < len + 4; i++) {
            sb.insert(0, c);
        }
        for (int i = 0; i < len + 4; i++) {
            sb.insert(sb.length(), c);
        }
        sb.append("\n");
        return sb.toString();
    }
}
