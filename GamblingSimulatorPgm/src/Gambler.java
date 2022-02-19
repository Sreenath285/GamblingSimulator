import java.util.Scanner;

public class Gambler {

    public static void main(String[] args) {
//        init initialStake and betEveryGame
//        input given from user
        int initialStake, betEveryGame;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial stake amount : ");
        initialStake = sc.nextInt();
        System.out.println("Enter bet amount every day : ");
        betEveryGame = sc.nextInt();
//      printing initialStake and betEveryGameValues
        System.out.println("Initial stake : " + initialStake);
        System.out.println("Bet amount : " + betEveryGame);
        System.out.println();
//      init isWin
//      generating random number if isWin == 1 wins the game else loose the game
        double isWin = Math.floor(Math.random() * 10 % 2);
        if (isWin == 1) {
//          calculating total amount with winning
            int totalWinAmt = initialStake + betEveryGame;
            System.out.println("Win amount : " + betEveryGame);
            System.out.println("Total Amount : " + totalWinAmt);
        }
        else {
//          if random is other than 1 then play loose the game
//          calculating total amount with losing
            int totalLoseAmt = initialStake - betEveryGame;
            System.out.println("Lose amount : " + betEveryGame);
            System.out.println("Total Amount : " + totalLoseAmt);
        }
    }
}
