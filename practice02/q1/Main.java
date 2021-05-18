import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("文字入力: ");
      String input = br.readLine();
      out.println(input);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
