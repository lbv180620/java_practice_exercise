import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Calculator> calculator_list = new ArrayList<>();
        calculator_list.add(new Sum());
        calculator_list.add(new Maltiplication());
        calculator_list.add(new Exponentiation());

        for (Calculator c : calculator_list) {
            exec(c);
        }
    }

    public static void exec(Calculator calculator) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        out.print("x = ");
        int x = Integer.parseInt(br.readLine());
        out.print("y = ");
        int y = Integer.parseInt(br.readLine());
        out.println("答え = " + calculator.calc(x, y));
        out.println("---------------");
    }
}
// ラムダ式の中でBudderReaderに関わるメソッドを呼び出すとコンパイルエラーになる
