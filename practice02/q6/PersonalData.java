import static java.lang.System.*;

public class PersonalData {
  private String name;
  private String furigana;
  private String address;

  public PersonalData(String name, String furigana, String address) {
    // if (name == null || furigana == null || address == null) {
    //   throw new Exception("文字を入力して下さい。");
    // }
    this.name = name;
    this.furigana = furigana;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String getFurigana() {
    return this.furigana;
  }

  public String getAddress() {
    return this.address;
  }

  public void printData() {
    out.printf("名前: %s\nふりがな: %s\n住所: %s\n", this.name, this.furigana, this.address);
    out.println("-----------------------");
  }
}
