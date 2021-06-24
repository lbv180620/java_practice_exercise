public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void sleep() {
        System.out.println("スースー");
    }

    public void speak() {
        System.out.println("ニャーニャー");
    }
}
