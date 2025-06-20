import java.util.*;
public class GuessNumber {

    public static void main(String[] args) {
        playGame();
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect && low <= high) {
            int guess = generateRandomNumber(low, high);
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserInput(scanner);

            switch (feedback) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number: " + guess);
                    isCorrect = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }

        if (!isCorrect) {
            System.out.println("No numbers left in range.");
        }

    }

    public static int generateRandomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static String getUserInput(Scanner scanner) {
        System.out.print("Enter feedback ('low', 'high', or 'correct'): ");
        return scanner.nextLine();
    }
}
