package player;

import race.Race;

public interface Player {

    void orderAttack(Player player, int myUnit, int enemyUnit);

    void isAttacked(int unit, Race enemy);

    boolean isLose();

    void printUnits();

    int getSize();
}
