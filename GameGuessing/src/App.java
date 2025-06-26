import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(101);

        System.out.println("Take a guess, pick a number from 0 to 100.");
        int guessUser = scanner.nextInt();

        int failedAttempts = 0;

        while (guessUser != randomNumber) {
            if (guessUser > randomNumber) {
                System.out.printf("The number is lower than %d.Try again\n", guessUser);
            } else {
                System.out.printf("The number is greater than %d.Try again\n", guessUser);
            }
            failedAttempts++;
            guessUser = scanner.nextInt();

        }

        System.out.printf("Congratulations. You guessed the number correctly, with %d attempts.",
                failedAttempts);

        scanner.close();
    }
}