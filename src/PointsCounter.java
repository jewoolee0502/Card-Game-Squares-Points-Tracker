import java.util.*;
import java.lang.*;

public class PointsCounter {
    private static int MAX_Points = 100;
    private static String playerName1;
    private static String playerName2;
    private static String playerName3;
    private static int points1 = 0;
    private static int points2 = 0;
    private static int points3 = 0;
    private static boolean again = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gameSetUp(input);
        game(input);
    }

    public static void gameSetUp(Scanner input) {
        System.out.println("Enter the player names: ");
        System.out.print("\t > Player 1: ");
        playerName1 = input.nextLine();
        System.out.print("\t > Player 2: ");
        playerName2 = input.nextLine();
        System.out.print("\t > Player 3: ");
        playerName3 = input.nextLine();

        if(playerName1 == null || playerName2 == null || playerName3 == null) {
            System.out.println("One of the player's name has not been entered.");
            System.exit(0);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void game(Scanner input) {
        while(again) {
            System.out.println("How much points did each players receive: ");
            System.out.print("\t > " + playerName1 + ": ");
            int temp1 = input.nextInt();
            System.out.print("\t > " + playerName2 + ": ");
            int temp2 = input.nextInt();
            System.out.print("\t > " + playerName3 + ": ");
            int temp3 = input.nextInt();

            System.out.println("What are the total points of each players: ");
            points1 += temp1;
            points2 += temp2;
            points3 += temp3;
            System.out.println("\t > " + playerName1 + ": " + temp1);
            System.out.println("\t > " + playerName2 + ": " + temp2);
            System.out.println("\t > " + playerName3 + ": " + temp3);

            if(points1 >= MAX_Points) {
                System.out.println(playerName1 + " has lost.");
                again = false;
            }
            if(points2 >= MAX_Points) {
                System.out.println(playerName2 + " has lost.");
                again = false;
            }
            if(points3 >= MAX_Points) {
                System.out.println(playerName3 + " has lost.");
                again = false;
            }
        }
        System.exit(0);
    }

}
