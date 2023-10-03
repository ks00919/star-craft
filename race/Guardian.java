package race;

public class Guardian extends Zerg {
    public Guardian() {
        super(3, 6);
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
