import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
      out.print("新規入力データの人数入力: ");
      int number = Integer.valueOf(br.readLine());

      PersonalData[] list = new PersonalData[number];

      for (int i = 0; i < list.length; i++) {
        out.print("名前入力: ");
        String name = br.readLine();

        out.print("ふりがな入力: ");
        String furigana = br.readLine();

        out.print("住所入力: ");
        String address = br.readLine();

        list[i] = new PersonalData(name, furigana, address);

        out.println("-------------------");
      }

      for (PersonalData pd : list) {
        pd.printData();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
