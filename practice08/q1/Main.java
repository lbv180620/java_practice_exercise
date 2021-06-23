import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("");
        dog.setName("ポチ");
        dog.showName();

        out.println("-----------------");

        Dog dog1 = new Dog(null);
        dog1.setName("シロ");
        dog1.setAge(8);
        Dog dog2 = new Dog("");
        dog2.setName("ブチ");
        dog2.setAge(5);
        Dog dog3 = new Dog("");
        dog3.setName("太郎");
        dog3.setAge(1);

        List<Dog> dogs = List.of(dog1, dog2, dog3);
        dogs.stream().forEach(x -> x.showProfile());

        out.println("-----------------");

        Dog dog4 = new Dog("チワワ");
        dog4.setName("シロ");
        dog4.setAge(8);
        Dog dog5 = new Dog("土佐犬");
        dog5.setName("ブチ");
        dog5.setAge(5);
        Dog dog6 = new Dog("柴犬");
        dog6.setName("太郎");
        dog6.setAge(1);

        List<Dog> dogs2 = List.of(dog4, dog5, dog6);
        dogs2.stream().forEach(x -> x.showProfile());
    }
}
