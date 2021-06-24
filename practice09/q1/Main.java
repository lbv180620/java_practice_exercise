import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("シロ", 10);
        Cat cat = new Cat("チャコ", 16);

        dog.showProfile();
        cat.showProfile();
        System.out.println("");
        dog.run();
        cat.sleep();
        System.out.println("");
        dog.speak();
        cat.speak();

        System.out.println("-------------------");

        Animal[] animals = new Animal[4];
        animals[0] = new Dog("ブチ", 13);
        animals[1] = new Cat("ラム", 10);
        animals[2] = new Dog("太朗", 5);
        animals[3] = new Cat("タマ", 8);

        for (Animal e : animals) {
            e.speak();
        }
    }
}
