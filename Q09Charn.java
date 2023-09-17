import java.util.Scanner;

public class Q09Charn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = s.next().charAt(0);
        int n = (int) ch;
        System.out.println(((n>64 && n<91)||(n>96 && n<123))? "is a alphabet" : "not a alphabet");
        s.close();    
    }

}
