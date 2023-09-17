import java.util.Scanner;

public class Q03Sinterest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal Amount(in Rs.): ");
        int p = s.nextInt();
        System.out.println("Enter Annual Rate in % : ");
        float r = s.nextFloat();
        System.out.println("now enter Time Period (in yrs): ");
        int t = s.nextInt();
        
        double si = (p*r*t)/100;
        System.out.println(si);
        s.close();
    }
}