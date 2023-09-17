import java.util.Scanner;

public class Q12Leapi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y%4==0 && y%100!=0){
            System.out.println("Its a leap year");
        }
        else
            System.out.println("not a leap year");
        s.close();
    }
}
