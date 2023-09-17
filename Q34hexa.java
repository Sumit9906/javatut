import java.util.Scanner;

public class Q34hexa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Hexadecimal number: ");
        String st = s.nextLine();
        // System.out.println();
        int len = st.length();
        int base = 1;
        int dec = 0;
        for(int i = len-1; i>=0; i--){
            if(st.charAt(i)>='0' && st.charAt(i)<='9'){
                dec = dec + ((st.charAt(i)-48)*base);
                base = base*16;
            }
            else if(st.charAt(i)>='A' && st.charAt(i)<='F'){
                dec = dec + ((st.charAt(i)-55)*base);
                base = base*16;

            }
        }
        System.out.println(dec);
        s.close();
    }
}
