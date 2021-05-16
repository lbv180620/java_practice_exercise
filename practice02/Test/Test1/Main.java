import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    out.print("名前を入力: ");

    try {
      String name = br.readLine();
      out.printf("こんにちは%sさん\n", name);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
