package race;

public class Dragoon extends Protos {

    public Dragoon() {
        super(3, 15);
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
