import java.util.Scanner;

public class Gambler {

    public static void main(String[] args) {

        int initialStake, betEveryGame, noOfDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial stake amount : ");
        initialStake = sc.nextInt();
        System.out.println("Enter bet amount : ");
        betEveryGame = sc.nextInt();
        System.out.println("Enter number of days to gamble : ");
        noOfDays = sc.nextInt();
        System.out.println();

        int maxWinDaily, minWInDaily;
        int dailyTotal = initialStake;
        
        for (int i = 1; i <= noOfDays; i++) {
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
            if (dailyTotal == maxWinDaily) {
                System.out.println("Day : " + i + " Gambler won the game");
            }
            else {
                System.out.println("Day : " + i + " Gambler lost the game");
            }
        }
        System.out.println("Total amount : " + dailyTotal);
    }
}
