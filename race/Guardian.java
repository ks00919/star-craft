package race;

public class Guardian extends Zerg implements Flyable {
    public Guardian() {
        super(3, 6);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
