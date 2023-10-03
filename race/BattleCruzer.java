package race;

public class BattleCruzer extends Terran {

    public BattleCruzer() {
        super(20, 30);
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canAttack(Flyable race) {
        return true;
    }
}
