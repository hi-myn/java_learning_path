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
            System.out.printf("You are underweight, your BMI is: %.1f%n" , imc);
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.printf("You are normal weight, your BMI is: %.1f%n" ,imc);
        } else if (imc >= 25 && imc < 29.9){
            System.out.printf("You are overweight, your BMI is: %.1f%n" , imc);
        } else {
            System.out.printf("You are obese, your BMI is: %.1f%n" , imc);
        }

        scanner.close();
    }
}
