package race;

public class Zealot extends Protos {

    public Zealot() {
        super(5, 20);
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
