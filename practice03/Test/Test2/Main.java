import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    String s1 = "aaaabacdeaf";
    out.printf("%s\n", s1.replaceAll("a", ""));
  }
}
