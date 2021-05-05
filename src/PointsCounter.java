import java.util.*;
import java.lang.*;

public class PointsCounter {
    private static String playerName1;
    private static String playerName2;
    private static String playerName3;
    private static int points1 = 0;
    private static int points2 = 0;
    private static int points3 = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    public static void gameSetUp(Scanner input) {
        System.out.println("Enter the player names: ");
        System.out.print("> Player 1: ");
        playerName1 = input.nextLine();
        System.out.print("> Player 2: ");
        playerName2 = input.nextLine();
        System.out.print("> Player 3: ");
        playerName3 = input.nextLine();

        if(playerName1 == null || playerName2 == null || playerName3 == null) {
            System.out.println("One of the player's name has not been entered.");
            System.exit(0);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void game(Scanner input) {

    }

}
