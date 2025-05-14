import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        double imc = weight / (height*height);

        if (imc < 18.5){
            System.out.println("You are underweight, your BMI is: " + imc);
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("You are normal weight, your BMI is: " + imc);
        } else if (imc >= 25 && imc < 29.9){
            System.out.println("You are overweight, your BMI is: " + imc);
        } else {
            System.out.println("You are obese, your BMI is: " + imc);
        }

        scanner.close();
    }
}
