import java.util.Scanner;

public class Q27pro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int product = DigitProduct(number);
        System.out.println("The product of the digits is: " + product);
        scanner.close();
    }

    public static int DigitProduct(int number) {
        int product = 1;
        if (number < 0) {
            number = Math.abs(number);
        }

        while (number != 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }

        return product;
    }
}
