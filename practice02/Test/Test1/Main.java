import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    out.print("名前を入力: ");

    String name = br.readLine();
    out.printf("こんにちは%sさん\n", name);

  }
}
