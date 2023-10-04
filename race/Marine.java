package race;

public class Marine extends Terran {

    public Marine() {
        super(3, 10);
    }

    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
