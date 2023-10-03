package race;

public class Corsair extends Protos {
    public Corsair() {
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
