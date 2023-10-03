package race;

public class Queen extends Zerg {

    public Queen() {
        super(15, 25);
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
