package race;

public class HighTempler extends Protos {

    public HighTempler() {
        super(10, 2);
    }

    @Override
    boolean canAttack(Race race) {
        return !(race instanceof Flyable);
    }
}
