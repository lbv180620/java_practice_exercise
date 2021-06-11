import static java.lang.System.*;
import java.lang.reflect.*;

import javax.swing.border.EmptyBorder;

public class Main {
  public static void main(String[] args) {
    Employee e = new Employee("Ichiro", "Suzuki");
    Class<? extends Employee> c = e.getClass();
    out.println("Class name: " + c.getName());
    out.println("Methods: ");

    for (Method m : c.getMethods()) {
      boolean isFirstParam = true;
      out.print(" " + m.getName() + "(");
      for (Class<?> p : m.getParameterTypes()) {
        if (!isFirstParam) {
          out.print(",");
        }
        out.print(p.getName());
        isFirstParam = false;
      }
      out.println(")");
    }
  }
}
