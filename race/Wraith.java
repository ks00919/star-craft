package race;

public class Wraith extends Terran implements Flyable {

    public Wraith() {
        super(3, 10);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
