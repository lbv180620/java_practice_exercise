import java.util.*;

public class Main {

    public static void main(String[] args) {
        FighterAircraft ap1 = new FighterAircraft("戦闘機");
        PassengerPlane ap2 = new PassengerPlane("旅客機");

        System.out.println(ap1.getType());
        ap1.fly();
        ap1.attack();
        System.out.println(ap2.getType());
        ap2.fly();
        ap2.carry();
    }
}
