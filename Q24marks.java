import java.util.Scanner;

public class Q24marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,c,b,m,l;
        System.out.println("Enter the marks: ");
        System.out.println("Maths: ");
        m = sc.nextInt();
        System.out.println("Physics: ");
        p = sc.nextInt();
        System.out.println("Chemistry: ");
        c = sc.nextInt();
        System.out.println("Biology: ");
        b = sc.nextInt();
        System.out.println("Computer: ");
        l = sc.nextInt();
        int per = (p+c+m+b+l)/5;
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=80 && per<90)
            System.out.println("Grade B");
        else if(per>=70 && per<80)
            System.out.println("Grade C");
        else if(per>=60 && per<70)
            System.out.println("Grade D");
        else if(per>=40 && per<60)
            System.out.println("Grade E");
        else if(per<40)
            System.out.println("Grade F");
        sc.close();
    }
}
