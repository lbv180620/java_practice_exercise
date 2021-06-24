public class PersonalComputer extends Computer {
    public PersonalComputer(String type) {
        super(type);
    }

    public void input() {
        System.out.println("キーボード・マウスで入力");
    }

    public void output() {
        System.out.println("ディスプレイに出力  ");
    }
}
