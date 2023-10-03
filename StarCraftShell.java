import java.util.InputMismatchException;
import java.util.Scanner;
import player.Player;
import player.ProtosPlayer;
import player.TerranPlayer;
import player.ZergPlayer;

public class StarCraftShell {

    private Player computer;
    private Player player;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");
        System.out.println("------------------------------------");

        setPlayers();

        while (true) {
            attackComputer();
            if (computer.isLose()) {
                System.out.println("승리했습니다!!");
                break;
            }
            defenceComputer();
            if (player.isLose()) {
                System.out.println("패배했습니다.");
                break;
            }
        }

        scanner.close();
    }

    private void attackComputer() {
        System.out.println();
        printPlayerUnits();
        System.out.println();
        System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요.");

        while (true) {
            int userUnit = getInputNumber("아군 유닛 : ");
            int computerUnit = getInputNumber("적군 유닛 : ");
            try {
                player.orderAttack(computer, userUnit, computerUnit);
                break;
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage());
                System.out.println();
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("유닛 선택을 잘못하였습니다. 다시 입력해주세요.");
            }
        }
        System.out.println();
    }

    private void defenceComputer() {

        System.out.println("컴퓨터 차례입니다.");

        int computerUnit = (int) (Math.random() * computer.getSize());
        int userUnit = (int) (Math.random() * player.getSize());
        try {
            computer.orderAttack(player, computerUnit, userUnit);
        } catch (IllegalArgumentException e) {
        }

    }

    private void setPlayers() {
        System.out.println("종족을 선택하세요.");
        System.out.println("0 : Terran / 1 : Protos / 2 : Zerg");
        while (true) {
            int number = getInputNumber("입력 : ");
            try {
                setPlayer(number);
                setComputer(number);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void setPlayer(int number) {
        if (number < 0 || number > 2) {
            throw new IllegalArgumentException("선택 숫자는 0보다 작거나 2보다 클 수 없습니다.");
        }

        switch (number) {
            case 0:
                this.player = new TerranPlayer();
                break;
            case 1:
                this.player = new ProtosPlayer();
                break;
            default:
                this.player = new ZergPlayer();
        }
    }

    private void setComputer(int user) {
        int computer;

        do {
            computer = (int) (Math.random() * 3);
        } while (computer == user);

        switch (computer) {
            case 0:
                this.computer = new TerranPlayer();
                break;
            case 1:
                this.computer = new ProtosPlayer();
                break;
            default:
                this.computer = new ZergPlayer();
        }
    }

    private int getInputNumber(String message) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
            }
        }
        return number;
    }

    private void printPlayerUnits() {
        System.out.print("적군: ");
        computer.printUnits();
        System.out.println();
        System.out.print("아군: ");
        player.printUnits();
    }
}
