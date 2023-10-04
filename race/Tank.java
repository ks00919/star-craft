package race;

public class Tank extends Terran {

    public Tank() {
        super(7, 15);
    }


    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
