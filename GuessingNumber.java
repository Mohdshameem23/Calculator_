import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    // generate a random number within a range
    public static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // start the guessing game
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Enter the range for the number to guess.");

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        int targetNumber = generateRandomNumber(lowerBound, upperBound);
        int guess;
        int attempts = 0;

        // game loop
        System.out.println("\nI have picked a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println(" Try again.");
            } else if (guess > targetNumber) {
                System.out.println(" Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        } while (guess != targetNumber);

        // Asking if the user wants to play again
        System.out.print("\nDo you want to play again? (yes/no): ");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("yes")) {
            startGame();  // Restart the game
        } else {
            System.out.println("Thanks for playing! Goodbye.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}
