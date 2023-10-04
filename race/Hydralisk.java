package race;

public class Hydralisk extends Zerg implements Shootable {

    public Hydralisk() {
        super(3, 7);
    }


    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
