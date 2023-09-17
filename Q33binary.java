import java.util.Scanner;

public class Q33binary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        if (isValidBinary(binaryString)) {
            int decimal = binaryToDecimal(binaryString);
            System.out.println("Decimal equivalent: " + decimal);
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary string.");
        }

        scanner.close();
    }

    public static boolean isValidBinary(String binaryString) {
        return binaryString.matches("[01]+");
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            char bit = binaryString.charAt(i);
            int power = length - i - 1;
            
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
        }
        return decimal;
    }
}
