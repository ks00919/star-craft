package race;

public class Ultralisk extends Zerg {

    public Ultralisk() {
        super(5, 15);
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
