import java.util.Scanner;

public class Q16Upr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        boolean f = Character.isUpperCase(c);
        if(f==true){
            System.out.println("Its Uppercase");
        }
        else
            System.out.println("Its Lower case");
        s.close();
    }
}
