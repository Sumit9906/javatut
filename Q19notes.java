import java.util.Scanner;

public class Q19notes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int n = s.nextInt();
        int[] notes = {2000,500,200,100,50,20,10};
        // int n1;
        int count = 0;
        while(n!=0){
            for(int i=0;i<notes.length;i++){
                if(n>=notes[i]){
                    count++;
                    n = n-notes[i];
                    break;
                }
            }
        }
        System.out.println(count);
        s.close();
    }
}
