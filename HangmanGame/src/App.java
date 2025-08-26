import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String secretWord = "SCORPIONS";
        char[] hiddenWord = new char[secretWord.length()];

        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }

        int maximumAttemptsNumber = 10;
        boolean isWon = false;

        while (maximumAttemptsNumber != 0) {
            System.out.printf("Hidden Word: %s\n", String.valueOf(hiddenWord));
            System.out.printf( "Number of attempts: %d \n", maximumAttemptsNumber);
            System.out.println("Type a letter: ");
            
            char guess = scanner.next().toUpperCase().charAt(0);
            boolean correct = false;
            
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    hiddenWord[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                maximumAttemptsNumber --;
                System.out.println("Incorrect letter.\n");
            } else{
                System.out.println("Correct letter.\n");
            }

            if (String.valueOf(hiddenWord).equals(secretWord)) {
                isWon = true;
                break;
            }

        }

        if (isWon) {
                System.out.printf("Congratulations, you have won. There were still %d attempts left.\n", maximumAttemptsNumber);
            } else{
                System.out.println("You lost!");
            }

            System.out.printf("The word was: %s",secretWord);

            scanner.close();

        
    }
}
