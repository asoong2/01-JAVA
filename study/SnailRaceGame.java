import java.util.Random;
import java.util.Scanner;

abstract class Snail {
    protected String color;
    protected int distance;

    public Snail(String color) {
        this.color = color;
        this.distance = 0;
    }

    public abstract void move(int diceRoll);

    public void printDistance() {
        System.out.printf("%s 달팽이가 %dmm를 이동했습니다. (누적 이동 거리: %dmm)\n", color, distance - distance, distance);
    }
}

class RedSnail extends Snail {
    public RedSnail() {
        super("빨강");
    }

    @Override
    public void move(int diceRoll) {
        distance += diceRoll;

        System.out.printf("%s 달팽이가 %dmm를 이동했습니다. (누적 이동 거리: %dmm)\n", color, diceRoll, distance);

        if (diceRoll == 6) {
            distance += rollDice();
            System.out.printf("%s 달팽이가 주사위를 한 번 더 굴립니다! (누적 이동 거리: %dmm)\n", color, distance);
        }
    }
}

class BlueSnail extends Snail {
    public BlueSnail() {
        super("파랑");
    }

    @Override
    public void move(int diceRoll) {
        distance += diceRoll;

        System.out.printf("%s 달팽이가 %dmm를 이동했습니다. (누적 이동 거리: %dmm)\n", color, diceRoll, distance);

        if (diceRoll == 6) {
            int leadingDistance = getLeadingDistance();
            distance = leadingDistance;
            System.out.printf("%s 달팽이가 선두인 달팽이와 같은 위치로 이동했습니다. (누적 이동 거리: %dmm)\n", color, distance);
        }
    }

    private int getLeadingDistance() {
        int maxDistance = -1;
        for (Snail snail : SnailRaceGame.snails) {
            if (snail.distance > maxDistance) {
                maxDistance = snail.distance;
            }
        }
        return maxDistance;
    }
}

class GreenSnail extends Snail {
    public GreenSnail() {
        super("초록");
    }

    @Override
    public void move(int diceRoll) {
        distance += diceRoll;

        System.out.printf("%s 달팽이가 %dmm를 이동했습니다. (누적 이동 거리: %dmm)\n", color, diceRoll, distance);

        if (diceRoll == 6) {
            int leadingDistance = getLeadingDistance();
            if (distance != leadingDistance) {
                distance = leadingDistance;
                System.out.printf("%s 달팽이가 선두인 달팽이와 같은 위치로 이동했습니다. (누적 이동 거리: %dmm)\n", color, distance);
            }
        }
    }

    private int getLeadingDistance() {
        int maxDistance = -1;
        for (Snail snail : SnailRaceGame.snails) {
            if (snail.distance > maxDistance) {
                maxDistance = snail.distance;
            }
        }
        return maxDistance;
    }
}

public class SnailRaceGame {
    static Snail[] snails = { new RedSnail(), new BlueSnail(), new GreenSnail() };
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            for (Snail snail : snails) {
                if (snail instanceof RedSnail) {
                    System.out.println("플레이어의 차례입니다. '챠카챠카'를 입력해주세요.");
                    String input = scanner.nextLine();
                    if (!input.equals("챠카챠카")) {
                        System.out.println("잘못된 입력입니다. '챠카챠카'를 입력해주세요.");
                        snail.move(0); // 유효하지 않은 입력이므로 주사위 굴림 없이 이동
                    } else {
                        int diceRoll = rollDice();
                        snail.move(diceRoll);
                    }
                } else {
                    int diceRoll = rollDice();
                    snail.move(diceRoll);
                }

                if (snail.distance >= 30) {
                    System.out.printf("%s 달팽이가 경주에서 승리했습니다!\n", snail.color);
                    return;
                }
            }
            System.out.println();
        }
    }

    public static int rollDice() {
        return ((int) (Math.random() * 6)) + 1;
    }
}
