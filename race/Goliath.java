package race;

public class Goliath extends Terran {

    public Goliath() {
        super(5, 15);
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
