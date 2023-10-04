package race;

public class Dragoon extends Protos implements Shootable {

    public Dragoon() {
        super(3, 15);
    }


    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
