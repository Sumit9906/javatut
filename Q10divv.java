import java.util.Scanner;
public class Q10divv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        System.out.println((n%5==0&&n%11==0)? "YES":"NO");
        s.close();
    }
}
