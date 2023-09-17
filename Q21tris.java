import java.util.Scanner;

public class Q21tris {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the sides: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a+b>c && c+b>a && c+a>b){
            System.out.println("Its a valid triangle");
        }
        else
            System.out.println("Its not a valid triangle");
        s.close();
    }
}
