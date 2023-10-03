package race;

public interface Race extends Flyable {

    void attack(Race race);

    void defence(int strikingPower);

    boolean canAttack(Flyable race);
}
