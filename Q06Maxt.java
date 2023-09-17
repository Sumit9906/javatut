import java.util.Scanner;

public class Q06Maxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a>b ? a:b;
        result = result>c ? result : c;
        System.out.println(result);
        sc.close();
    }
}