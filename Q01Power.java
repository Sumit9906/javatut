import java.util.Scanner;

public class Q01Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter exponent: ");
        int pow = sc.nextInt();
        double result = 1;
        if(pow==0){
            System.out.println(result);
        }
        else if(pow>0){
            for(int i=0;i<pow;++i){
                result = result*num;
            }
        }
        else if(pow<0){
            for(int i=pow;i<0;++i){
                result = 1/(result*num);
            }
            System.out.println("this"+ 1/4);
        }
        System.out.println(result);
        sc.close();
    }
}