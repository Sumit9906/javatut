import java.util.Scanner;

public class Q20tri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=0;
        System.out.println("Enter the angles(in Deg) : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        n=a+b+c;
        if(n==180){
            System.out.println("Triangle is valid");
        }
        else
            System.out.println("Its not a valid triangle");
        s.close();
    }
}
