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
            int additionalRoll = SnailRaceGame.rollDice();
            distance += additionalRoll;
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
            Snail leadingSnail = getLeadingSnail();
            if (leadingSnail != null && leadingSnail != this) {
                distance = leadingSnail.distance;
                System.out.printf("%s 달팽이가 선두인 %s 달팽이를 자기 위치로 이동했습니다. (누적 이동 거리: %dmm)\n",
                        color, leadingSnail.color, distance);
            }
        }
    }

    private Snail getLeadingSnail() {
        Snail leadingSnail = null;
        int maxDistance = -1;
        for (Snail snail : SnailRaceGame.snails) {
            if (snail.distance > maxDistance) {
                maxDistance = snail.distance;
                leadingSnail = snail;
            }
        }
        return leadingSnail;
    }
}


public class SnailRaceGame {
    static Snail[] snails = { new RedSnail(), new BlueSnail(), new GreenSnail() };
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("[달팽이 레이스]\n가장 먼저 30mm에 도착한 달팽이가 승리합니다!");
        System.out.println("주사위를 굴려 나오는 수만큼 달팽이가 이동하며, 주사위가 6이 나오면 달팽이가 특수 스킬을 발동합니다.");
        System.out.println("빨강 달팽이는 더블 주사위를, 파랑 달팽이는 텔레포트를, 초록 달팽이는 물귀신 스킬을 가지고 있습니다.");
        System.out.println("마음에 드는 스킬을 가진 달팽이를 선택해 주세요!");
        System.out.print("선택 (빨강/파랑/초록): ");
        String playerChoice = scanner.nextLine();

        Snail selectedSnail = null;
        for (Snail snail : snails) {
            if (snail.color.equals(playerChoice)) {
                selectedSnail = snail;
                break;
            }
        }

        if (selectedSnail == null) {
            System.out.println("잘못된 선택입니다. 기본값으로 빨강 달팽이로 시작합니다.");
            selectedSnail = snails[0];
        }

        while (true) {
            boolean anySnailReached30 = false;
            for (Snail snail : snails) {
                if (snail == selectedSnail) {
                    System.out.println("턴이 시작됩니다. 달팽이들이 이동할 수 있게 힘을 주세요! '챠카챠카'를 입력하면 달팽이들이 꾸물꾸물 달려갑니다.");
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
                    anySnailReached30 = true;
                    System.out.printf("%s 달팽이가 경주에서 승리했습니다!\n", snail.color);
                    if (snail == selectedSnail) {
                        System.out.println("당신이 최종 우승하였습니다! 신난 달팽이가 꾸물꾸물 춤을 춥니다!");
                    } else {
                        System.out.println("아쉽게도 경주에서 지고 말았습니다. 기운이 없어진 슬픈 달팽이...");
                    }
                    break;
                }
            }

            if (anySnailReached30) {
                break;
            }

            System.out.println();
        }
    }

    public static int rollDice() {
        return ((int) (Math.random() * 6)) + 1;
    }
}



