import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account(" 1234 5678 ");
        Account ac2 = new Account("1234 5679");

        List<Account> list = new ArrayList<>(Arrays.asList(ac1, ac2));

        out.println(ac1.toString());
        out.println(ac2.toString());

        if (ac1.equals(ac2)) {
            out.println("等価");
        } else {
            out.println("等価ではない");
        }

        out.println(list);

        list.remove(ac1);
        out.println(list);
        list.remove(ac1);
        out.println(list);
    }
}
