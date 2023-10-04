package race;

public class Corsair extends Protos implements Flyable {
    public Corsair() {
        super(4, 12);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
