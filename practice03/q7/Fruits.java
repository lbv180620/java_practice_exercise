import static java.lang.System.*;

public class Fruits {
  private String fruit;
  private int price = 0;

  public Fruits(String fruit) {
    this.fruit = fruit;
  }

  public String getFruit() {
    return this.fruit;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
