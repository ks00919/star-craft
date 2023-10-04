package race;

public class Zealot extends Protos {

    public Zealot() {
        super(5, 20);
    }

    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
