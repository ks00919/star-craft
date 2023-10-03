package race;

public class Zergling extends Zerg {
    public Zergling() {
        super(2, 2);
    }


    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canAttack(Flyable race) {
        return !race.canFly();
    }
}
