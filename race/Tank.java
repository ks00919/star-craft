package race;

public class Tank extends Terran {

    public Tank() {
        super(7, 15);
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
