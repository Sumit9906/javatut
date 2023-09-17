import java.util.Scanner;

public class Q26elec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        double u = sc.nextDouble();
        double amount = 0;
        if(u<=50){
            amount = u*0.5;
        }
        else if(u>50 && u<=150){
            amount = (u-50)*0.75 + (50*0.5);
        }
        else if(u>150 && u<=250){
            amount = (50*0.5) + (100*0.75) + (u-150)*1.20;
        }
        else if(u>250){
            amount = (50*0.5) + (100*0.75) + (100*1.20) + (u-250)*1.50;
        }
        System.out.println("Your total amount is: " + amount);
        sc.close();
    }
}
