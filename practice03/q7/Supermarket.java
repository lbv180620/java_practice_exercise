import static java.lang.System.*;

public class Supermarket {
  private boolean open = true;

  public boolean open() {
    return this.open;
  }

  public void setOpen(boolean open) {
    this.open = open;
  }

  public void buy(Fruits f1, Fruits f2) {
    if (this.open != true) {
      out.println("閉店してます。");
      out.println("帰宅しました。");
    } else {
      if (f1.getPrice() < f2.getPrice()) {
        out.printf("%sを買いました。\n", f1.getFruit());
      } else if (f1.getPrice() > f2.getPrice()) {
        out.printf("%sを買いました。\n", f2.getFruit());
      }
    }

  }
}
