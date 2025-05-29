import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String decisionUser;

        do {
            System.out.println("Enter the setence to count the letters: ");
            String phrase = input.nextLine();
            
            System.out.printf("The setence '%s' has %d letters", phrase, countLetter(phrase));

            System.out.println("\nDo you want to type another setence? Type [Y]es or [N]o");
            decisionUser = input.nextLine().toLowerCase();
            
        } while (decisionUser.startsWith("y"));

        System.out.println("Program closed.");

        input.close();
    }

    public static int countLetter(String phrase){
        return phrase.replace(" ", "").length();
    }
}
