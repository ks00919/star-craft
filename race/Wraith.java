package race;

public class Wraith extends Terran {

    public Wraith() {
        super(3, 10);
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
