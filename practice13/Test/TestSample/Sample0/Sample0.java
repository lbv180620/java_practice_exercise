import java.util.*;

public class Sample0 {
    public static void main(String[] args) {
        char[] chars = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(chars);
        Arrays.fill(chars, '\0');
        System.out.println(chars);
        Arrays.fill(chars, '0');
        System.out.println(chars);
    }
}
