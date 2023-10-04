package race;

public class BattleCruzer extends Terran implements Flyable {
    public BattleCruzer() {
        super(20, 30);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
