import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
      String s;
      while ((s = br.readLine()) != null) {
        out.println(s);
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

/*
 * FileInputStream キャスト必要 1文字ずつ InputStreamReader + FileInputStream キャスト不要
 * 指定文字列数ごと StringWriter + InputStreamReader + FileInputStream バッファに書き込みまとめて表示
 *
 * FileReader InputStreamREaderは内部でしてくれる BufferedReader + Filereader 1行ごとに読み込める
 *
 * FileReader = FileInputStream + InputStreamReader BufferedREader + FileREader
 * = InputStreamReader + FileInputStream + StringWriter
 *
 * Streamはバイナリ Readerはテキスト
 */
