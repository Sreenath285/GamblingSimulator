import java.util.Scanner;

public class Gambler {

    int initialStake, betEveryGame, noOfDays;
    int maxWinDaily, minWInDaily;
    int dailyTotal = initialStake;
    int monthlyWin = 0, monthlyLost = 0;

    public void gambleInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter initial stake amount : ");
            initialStake = sc.nextInt();
            System.out.println("Enter bet amount : ");
            betEveryGame = sc.nextInt();
            System.out.println("Enter number of days to gamble : ");
            noOfDays = sc.nextInt();
            System.out.println();
        }

    public void dailyGamble() {
        maxWinDaily = dailyTotal + (initialStake / 2);
        minWInDaily = dailyTotal - (initialStake / 2) ;
        while (dailyTotal < maxWinDaily && dailyTotal > minWInDaily) {
            double isWin = Math.floor(Math.random() * 10 % 2);
            if (isWin == 1) {
                dailyTotal += betEveryGame;
            } else {
                dailyTotal -= betEveryGame;
            }
        }
    }

    public void monthlyGamble() {

        for (int i = 1; i <= noOfDays; i++) {

            dailyGamble();

            if (dailyTotal == maxWinDaily) {
                System.out.println("Day : " + i + " Gambler won the game");
                monthlyWin = (initialStake / 2) + monthlyWin;
            }
            else{
                System.out.println("Day : " + i + " Gambler lost the game");
                monthlyLost = (initialStake / 2) + monthlyLost;
            }
        }
        status();
    }

    public void status () {
        System.out.println();
        System.out.println("Monthly win amount : " + monthlyWin);
        System.out.println("Monthly lost amount : " + monthlyLost);
        if (monthlyWin > monthlyLost) {
            System.out.println("Win amount : " + (monthlyWin - monthlyLost));
            System.out.println("Continue gambling next month");
        }
        else if (monthlyWin < monthlyLost) {
            System.out.println("Lost amount : " + (monthlyLost - monthlyWin));
            System.out.println("It's good for you not gamble next month");
        }
        else {
            System.out.println("Better luck next time");
        }
    }
}
