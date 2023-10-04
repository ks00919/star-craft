package race;

public class Zergling extends Zerg {
    public Zergling() {
        super(2, 2);
    }


    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
