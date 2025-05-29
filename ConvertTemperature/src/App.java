import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the type of conversion");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        int chosenTemperatureUnit = input.nextInt();

        System.out.println("Enter the temperature: ");
        double temperature = input.nextDouble();


        if (chosenTemperatureUnit == 1) {
            celsiusToFahrenheit(temperature);
        } else if (chosenTemperatureUnit == 2){
            FahrenheitToCelsius(temperature);
        }
        else{
            System.out.println("Invalid option");
        }

        input.close();
        
    }

    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Celsius to Fahrenheit is " + fahrenheit + "F");
    }

    public static void FahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9  ;
        System.out.println("Temperature in Fahrenheit to Celsius is " + celsius + "C");
    }
}
