package race;

public class Hydralisk extends Zerg {

    public Hydralisk() {
        super(3, 7);
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canAttack(Flyable race) {
        return true;
    }
}
