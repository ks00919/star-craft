package race;

public class Scout extends Protos implements Flyable {

    public Scout() {
        super(5, 10);
    }

    @Override
    boolean canAttack(Race race) {
        return true;
    }
}
