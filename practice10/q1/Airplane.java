public abstract class Airplane {
    private String type;

    public Airplane(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public abstract void fly();
}
