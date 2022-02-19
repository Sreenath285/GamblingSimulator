import java.util.Scanner;

public class Gambler {

    public static void main(String[] args) {

        int initialStake, betEveryGame;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial stake amount : ");
        initialStake = sc.nextInt();
        System.out.println("Enter bet amount : ");
        betEveryGame = sc.nextInt();
        System.out.println();

        int maxWinDaily, minWInDaily;
        int dailyTotal = initialStake;
        maxWinDaily = dailyTotal + (initialStake / 2);
        minWInDaily = dailyTotal - (initialStake / 2) ;

        while (dailyTotal < maxWinDaily && dailyTotal > minWInDaily) {
            double isWin = Math.floor(Math.random() * 10 % 2);
            if (isWin == 1) {
                dailyTotal += betEveryGame;
                System.out.println("Won the game");
                System.out.println("Total amount : " + dailyTotal);
            } else {
                dailyTotal -= betEveryGame;
                System.out.println("Lost the game");
                System.out.println("Total amount : " + dailyTotal);
            }
        }
        if (dailyTotal == maxWinDaily) {
            System.out.println("Gambler won the maximum amount and left the game");
        }
        else {
            System.out.println("Gambler lost the maximum amount and left the game");
        }
    }
}
