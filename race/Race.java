package race;

public abstract class Race {

    private final int strikingPower;
    private int defensivePower;

    protected Race(int strikingPower, int defensivePower) {
        this.strikingPower = strikingPower;
        this.defensivePower = defensivePower;
    }

    public void attack(Race race) {
        if (!this.canAttack(race)) {
            throw new IllegalArgumentException("공격할 수 없는 유닛입니다.");
        }
        race.defence(this.strikingPower);
    }

    public void defence(int strikingPower) {
        this.defensivePower -= strikingPower;
        if (this.defensivePower <= 0) {
            throw new ArithmeticException(this.getClass().getSimpleName() + " 의 방어력이 0 입니다.");
        }
    }

    abstract boolean canAttack(Race race);

    public String status() {
        return this.getClass().getSimpleName() + " (현재 방어력: " + this.defensivePower + (")");
    }
}
