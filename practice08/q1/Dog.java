public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.printf("名前は%sです\n", this.name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public void showProfile() {
    // System.out.printf("名前: %s, 年齢: %d\n", this.name, this.age);
    // }

    public void showProfile() {
        System.out.printf("名前: %s, 年齢: %d, 犬種: %s\n", this.name, this.age, this.breed);
    }
}
