import java.util.Scanner;

public class Q31sprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            if(PrimeCheck(i)==true){
                sum = sum+i;
            }
            else
                continue;
        }
        System.out.println(sum);
        s.close();
    }
    public static boolean PrimeCheck(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
