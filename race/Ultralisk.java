package race;

public class Ultralisk extends Zerg {

    public Ultralisk() {
        super(5, 15);
    }

    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
