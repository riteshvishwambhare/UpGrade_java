package conditionalStatement;
import java.util.Scanner;

public class PrimeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int i ;

        for( i = 2 ; i<= n /2 ; i++){
            if (n % i == 0 ) {
                System.out.println(" it is not a prime number");
                break;
            }
            System.out.println("it is a prime number");
        }
    }
}