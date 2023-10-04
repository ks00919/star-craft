package race;

public class Queen extends Zerg implements Flyable {

    public Queen() {
        super(15, 25);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
