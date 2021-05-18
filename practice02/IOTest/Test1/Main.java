import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("hello.txt");
      int i;
      while ((i = fis.read()) != -1) {
        if (0x1F < i && i < 0x7E) {
          out.println((char) i);
          out.println(i);
        }
      }
      fis.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

/*
 * コード範囲 内容 0x00 - 0x1F 制御文字 0x20 半角スペース 0x21 - 0x7E 図形文字 0x7F 制御文字（DEL）
 */
