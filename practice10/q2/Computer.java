public abstract class Computer {
    private String type;

    public Computer(String type) {
        this.type = type;
    }

    public void showType() {
        System.out.printf("コンピュータの種類: %s\n", this.type);
    }

    public abstract void input();

    public abstract void output();

    public void communication() {
        System.out.println("インターネットで通信");
    }
}
