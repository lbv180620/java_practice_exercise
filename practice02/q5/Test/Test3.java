import java.util.*;
import java.io.*;
import java.text.*;
import static java.lang.System.*;

public class Test3 {
  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
    Date d = f.parse("2021年06月01日12時40分23秒");
    out.println(d);

    Date now = new Date();
    String s = f.format(now);
    out.println(s);
  }
}
