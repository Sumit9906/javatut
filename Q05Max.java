import java.util.Scanner;

public class Q05Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a>b ? a : b;
        System.out.println(result);
        sc.close();
    }
}