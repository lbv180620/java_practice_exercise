public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProfile() {
        System.out.printf("名前: %s, 年齢: %d才\n", name, age);
    }

    public abstract void speak();
}
