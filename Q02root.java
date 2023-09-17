import java.lang.Math;
import java.util.Scanner;

public class Q02root{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = s.nextInt();
        double result = Math.sqrt(num);
        System.out.println(result);    
        s.close();
    }
}