import java.util.Scanner;
public class Q22type{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a==b && b==c){
            System.out.println("Its an equilateral triangle");
        }
        else if(a==b || b==c){
            System.out.println("Its an isosceles triangle");
        }
        else
            System.out.println("Its an scalene triangle");

        s.close();
    }
}