public class PassengerPlane extends Airplane {
    public PassengerPlane(String type) {
        super(type);
    }

    public void fly() {
        System.out.println("乗客を乗せて目的地まで飛行します");
    }

    public void carry() {
        System.out.println("乗客を目的地まで運びます");
    }
}
