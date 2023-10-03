package race;

public class Carrier extends Protos {

    public Carrier() {
        super(25, 40);
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
