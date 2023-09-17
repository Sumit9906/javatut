import java.util.Scanner;

public class Q13Charni {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int n = (int) ch;
        if((n>64 && n<91)||(n>96 && n< 123)){
            System.out.println("its alphabet");
        }
        else
            System.out.println("not an alphabet");

        s.close();
    }
}
