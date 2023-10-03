package player;

import java.util.ArrayList;
import java.util.List;
import race.Protos;
import race.Race;
import race.genealogy.ProtosList;

public class ProtosPlayer implements Player {

    private List<Protos> units;

    public ProtosPlayer() {
        units = new ArrayList<>();
        setUnits();
    }

    private void setUnits() {
        ProtosList[] list = ProtosList.values();
        for (int i = 0; i < 4; i++) {
            units.add(list[(int) (Math.random() * list.length)].getProtos());
        }
    }

    @Override
    public void orderAttack(Player player, int myUnit, int enemyUnit) {
        player.isAttacked(enemyUnit, this.units.get(myUnit));
    }

    @Override
    public void isAttacked(int unit, Race enemy) {
        try {
            enemy.attack(this.units.get(unit));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            this.units.remove(unit);
        }
    }

    @Override
    public boolean isLose() {
        return this.units.isEmpty();
    }

    @Override
    public void printUnits() {
        System.out.println("Protos");
        for (int i = 0; i < this.units.size(); i++) {
            System.out.println(i + ". " + this.units.get(i).status());
        }
    }

    @Override
    public int getSize() {
        return units.size();
    }

}
