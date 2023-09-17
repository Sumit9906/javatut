import java.util.Scanner;

public class Q11Eveni {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0)
            System.out.println("Its Even");
        else
            System.out.println("Its odd");   
            
        s.close();
    }
}
