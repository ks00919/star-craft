package race;

public class Valkyrie extends Terran {

    public Valkyrie() {
        super(4, 12);
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
