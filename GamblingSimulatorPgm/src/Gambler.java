import java.util.Scanner;

public class Gambler {

    public static void main(String[] args) {

        int initialStake, betEveryGame;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial stake amount : ");
        initialStake = sc.nextInt();
        System.out.println("Enter bet amount every day : ");
        betEveryGame = sc.nextInt();

        System.out.println("Initial stake : " + initialStake);
        System.out.println("Bet amount : " + betEveryGame);

    }
}
