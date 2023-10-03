package race;

public class Marine extends Terran {

    public Marine() {
        super(3, 10);
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
