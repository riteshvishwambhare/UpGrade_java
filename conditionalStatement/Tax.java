package conditionalStatement;
import java.util.Scanner;
public class Tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        int tax = 0;
        if(amount <= 500000){
            tax = 0;
        }
        else if (amount > 500000 && amount <= 1000000){
            tax = (int) (amount * 0.2);
        }
        else{
            tax = (int) (amount * 0.3);
        }
        sc.close();
        System.out.println("Your tax is a : " + tax);\
        
    }
}
