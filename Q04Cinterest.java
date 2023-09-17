import java.util.Scanner;
import java.lang.Math;

public class Q04Cinterest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal Amount(in Rs.): ");
        int p = s.nextInt();
        System.out.println("Enter Annual Rate in % : ");
        float r = s.nextFloat();
        System.out.println("now enter Time Period (in yrs): ");
        int t = s.nextInt();
        
        double v = Math.pow((1+(r/100)), t);
        double ci = p*v-p;
        System.out.println(ci);
        s.close();
    }
}