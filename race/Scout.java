package race;

public class Scout extends Protos {

    public Scout() {
        super(5, 10);
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
