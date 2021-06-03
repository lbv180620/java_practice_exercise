import java.util.*;
import java.io.*;
import java.time.*;
import static java.lang.System.*;

public class Test4 {
  public static void main(String[] args) {
    Instant i1 = Instant.now();
    out.println(i1);
    Instant i2 = Instant.ofEpochMilli(16734893893L);
    out.println(i2);
    long l = i2.toEpochMilli();
    out.println(l);

    out.println("---------------");

    ZonedDateTime z1 = ZonedDateTime.now();
    out.println(z1);
    ZonedDateTime z2 = ZonedDateTime.of(2021, 5, 31, 6, 34, 22, 8, ZoneId.of("Europe/London"));
    out.println(z2);

    out.println("---------------");

    Instant i3 = z2.toInstant();
    out.println(i3);
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Asia/Tokyo"));
    out.println(z3);

    out.println("---------------");

    out.printf("東京: %d/%d/%d\n", z2.getYear(), z2.getMonthValue(), z2.getDayOfMonth());
    out.printf("ロンドン: %d/%d/%d\n", z3.getYear(), z3.getMonthValue(), z3.getDayOfMonth());

    if (z2.isEqual(z3)) {
      out.println("同じ瞬間");
    }
  }
}
