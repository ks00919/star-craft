package race;

public class Mutalisk extends Zerg implements Flyable {
    public Mutalisk() {
        super(2, 8);
    }


    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
