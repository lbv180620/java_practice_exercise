public class FighterAircraft extends Airplane {
    public FighterAircraft(String type) {
        super(type);
    }

    public void fly() {
        System.out.println("攻撃に出るために飛行します");
    }

    public void attack() {
        System.out.println("戦闘します");
    }
}
