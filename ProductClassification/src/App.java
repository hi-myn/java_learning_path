import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String product1 = "notebook";
        String product2 = "key";
        String product3 = "keyboard";

        double price = 0;

        System.out.println("Enter the product name: ");
        String inputProduct = scanner.next();

        if (product1.equalsIgnoreCase(inputProduct) || product2.equalsIgnoreCase(inputProduct)|| product3.equalsIgnoreCase(inputProduct)) {
            System.out.println("The product is cataloged. Do you want to change the price? (y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Enter the new price:");
                price = scanner.nextDouble();

            } else {
                System.out.println("Price not updated.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Enter the product price:");
            price = scanner.nextDouble();
        }

        String classification = (price < 50) ? "cheap" : (price >= 50 && price <= 100) ? "moderately" : "expensive";
        System.out.println("The product " + inputProduct + " is " + classification + ". Price : " + price);

        scanner.close();
    }
}
