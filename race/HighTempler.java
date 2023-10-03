package race;

public class HighTempler extends Protos {

    public HighTempler() {
        super(10, 2);
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
