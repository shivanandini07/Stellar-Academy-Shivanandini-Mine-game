Simport java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Main class - Entry point for Mine Escape: The Last Shift
 * Demonstrates: Exception Handling, OOP, Strings
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            try {
                System.out.println("========================================");
                System.out.println("    MINE ESCAPE: THE LAST SHIFT");
                System.out.println("========================================");
                System.out.println();
                System.out.print("Enter your miner name: ");
                
                String playerName = scanner.nextLine().trim();

                // Exception Handling: check for empty input
                if (playerName.isEmpty()) {
                    System.out.println("Name cannot be empty. Using default name: Miner");
                    playerName = "Miner";
                }

                // Create and start game
                Game game = new Game(playerName);
                game.start();

                // Ask if player wants to play again
                System.out.println();
                System.out.print("Do you want to play again? (y/n): ");
                String playAgain = scanner.nextLine().trim().toLowerCase();

                if (!playAgain.equals("y")) {
                    playing = false;
                    System.out.println();
                    System.out.println("Thank you for playing Mine Escape: The Last Shift!");
                    System.out.println("Goodbye!");
                }

                System.out.println();

            } catch (InputMismatchException e) {
                // Exception Handling for invalid input
                System.out.println("Invalid input detected. Please try again.");
                scanner.nextLine();
            } catch (Exception e) {
                // Catch any other unexpected exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
