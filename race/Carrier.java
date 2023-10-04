package race;

public class Carrier extends Protos implements Flyable {
    public Carrier() {
        super(25, 40);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
