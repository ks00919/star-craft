package race;

public class Mutalisk extends Zerg {
    public Mutalisk() {
        super(2, 8);
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
