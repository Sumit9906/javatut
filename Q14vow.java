import java.util.Scanner;

public class Q14vow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        String vow = "aeiouAEIOU";
        int i ;
        for(i=0;i<10;i++){
            if(c==vow.charAt(i)){
                System.out.println("Its a vowel");
                break;
            }
            else 
                continue;
        }
        if(i==10){
            System.out.println("Its a consonant");
        }
        s.close();
    }
}
