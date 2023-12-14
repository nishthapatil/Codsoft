import java.util.Random;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 5;
        int playAgain;
        do {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            int attempts = 0;
            System.out.println("Guess the number between 0 and 100.");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts.");
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
                attempts++;
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you have exceeded the maximum number of attempts. The correct number was " + randomNumber + ".");
            }
            System.out.print("Do you want to play again? (1 for yes, 0 for no): ");
            playAgain = sc.nextInt();
        } while (playAgain == 1);
        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}
