import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter the student's name: ");
        String nameStudent = input.nextLine();

        System.out.println("Then enter the student's 3 grades");
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        String resultFinal = (average >= 7) ? "Pass" : "Fail";

        System.out.printf("The student %s has an average of %.1f points, and was %S", nameStudent, average, resultFinal);

        input.close();
    }
}
