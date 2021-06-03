import java.util.*;
import java.io.*;
import java.time.*;
import static java.lang.System.*;

public class Test5 {
  public static void main(String[] args) {
    LocalDateTime l1 = LocalDateTime.now();
    out.println(l1);
    LocalDateTime l2 = LocalDateTime.of(2020, 5, 31, 6, 23, 45);
    out.println(l2);

    out.println("----------");

    ZonedDateTime z1 = l2.atZone(ZoneId.of("Asia/Tokyo"));
    out.println(z1);
    LocalDateTime l3 = z1.toLocalDateTime();
    out.println(l3);

    out.println("----------");

    Year y1 = Year.now();
    out.println(y1);
    YearMonth ym1 = YearMonth.of(1990, 8);
    out.println(ym1);
    YearMonth ym2 = y1.atMonth(6);
    out.println(ym2);
  }
}
