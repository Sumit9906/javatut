import java.util.Scanner;

public class Q15Cha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        int n = (int) c;
        if(n>47 && n<58){
            System.out.println("Its a digit");
        }
        else if((n>64 && n<91)||(n>96 && n<123)){
            System.out.println("Its an alphabet");
        }
        else 
            System.out.println("Its a special character");
        
        s.close();
    }
}
