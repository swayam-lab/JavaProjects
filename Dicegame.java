import java.util.Random;
import java.util.Scanner;

public class Dicegame {

    // Method to simulate the rolling of two dice
    public static int rollDice() {
        Random rand = new Random();
        // Generate a random number between 1 and 6 for each die
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        // Return the sum of the two dice
        return die1 + die2;
    }

    // Method to start the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the Dice Game!");
            System.out.print("Guess the sum of two dice rolls (between 2 and 12): ");
            int userGuess = scanner.nextInt();

            // Validate user input
            if (userGuess < 2 || userGuess > 12) {
                System.out.println("Invalid guess! The sum must be between 2 and 12.");
                continue;
            }

            // Roll the dice and calculate the sum
            int diceSum = rollDice();
            System.out.println("The dice rolled a sum of: " + diceSum);

            // Check if the user's guess is correct
            if (userGuess == diceSum) {
                System.out.println("Congratulations! You guessed correctly.");
            } else {
                System.out.println("Sorry, you guessed wrong. Better luck next time.");
            }

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }

    // Main method to start the game
    public static void main(String[] args) {
        playGame();
    }
}
