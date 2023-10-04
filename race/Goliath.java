package race;

public class Goliath extends Terran implements Shootable {
    public Goliath() {
        super(5, 15);
    }


    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
