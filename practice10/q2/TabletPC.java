public class TabletPC extends Computer {
    public TabletPC(String type) {
        super(type);
    }

    public void input() {
        System.out.println("タッチパネルディスプレイをタップして操作");
    }

    public void output() {
        System.out.println("タッチパネルディスプレイに出力");
    }
}
