import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.printf("Multiplication table of %d",number);
        System.out.printf("\n%d * 1 = %d", number, number*1);
        System.out.printf("\n%d * 2 = %d", number, number*2);
        System.out.printf("\n%d * 3 = %d", number, number*3);
        System.out.printf("\n%d * 4 = %d", number, number*4);
        System.out.printf("\n%d * 5 = %d", number, number*5);
        System.out.printf("\n%d * 6 = %d", number, number*6);
        System.out.printf("\n%d * 7 = %d", number, number*7);
        System.out.printf("\n%d * 8 = %d", number, number*8);
        System.out.printf("\n%d * 9 = %d", number, number*9);
        System.out.printf("\n%d * 10 = %d", number, number*10);

        input.close();

    }
}
