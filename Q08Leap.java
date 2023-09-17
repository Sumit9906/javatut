import java.util.Scanner;

public class Q08Leap {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr = sn.nextInt();
        System.out.println((yr%4==0) ? (yr%100 != 0 ?"it is a leap year": "not a leap year") : "not a leap year");
        sn.close();
    }
}
