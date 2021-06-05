import static java.lang.System.*;
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    out.print("郵便番号入力(ハイフンあり): ");
    String zip = br.readLine();
    while (!(zip.matches("[0-9]{3}-[0-9]{4}"))) {
      out.print("やり直して下さい: ");
      zip = br.readLine();
    }
    out.printf("%s\n", zip);

    out.println("-----------------");

    out.print("郵便番号入力(ハイフンなし): ");
    String zip2 = br.readLine();
    while (!(zip2.matches("\\d{3}\\d{4}"))) {
      out.print("やり直して下さい: ");
      zip2 = br.readLine();
    }
    out.printf("zip2 = %s\n", zip2);
    StringBuilder sb = new StringBuilder(zip2);
    sb.insert(3, "-");
    String zip3 = sb.toString();
    out.printf("zip3 = %s\n", zip3);

  }
}
