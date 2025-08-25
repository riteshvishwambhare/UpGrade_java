package switchStatement;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the currency ");
        System.out.println(" U for USD to EUR");
        System.out.println(" E for EUR to USD");
        char currency=sc.next().charAt(0);

        System.out.println("Enter Amout");
        double amount =sc.nextDouble();

        
        
        switch (currency) {
            case 'U':
                System.out.println(amount+ "USD " + ( amount * 0.92) + "  EUR");
                break;
            case 'E':
                System.out.println(amount+ "EUR " + ( amount * 1.09) + " USD");
                break;

            default:
               break;
        }
        sc.close();
    }
}
