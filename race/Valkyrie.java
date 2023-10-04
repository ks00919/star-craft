package race;

public class Valkyrie extends Terran implements Flyable {

    public Valkyrie() {
        super(4, 12);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
