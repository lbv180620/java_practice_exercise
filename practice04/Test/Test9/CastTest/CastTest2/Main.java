import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> objList = Arrays.asList("One", "Two", "Three");
        List<String> strList = (List<String>) objList;
        for (String str : strList) {
            out.println(str);
        }
    }
}
