import java.util.Scanner;

public class Q23profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("You made a profit of $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("You incurred a loss of $" + (-profitOrLoss));
        } else {
            System.out.println("You broke even. No profit or loss.");
        }

        scanner.close();
    }
}
