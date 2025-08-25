package Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the positive Number");
    int num = sc.nextInt();
    if (num < 0) {
        System.out.println("Please Enter The Positive Number");
    }else{
        int factorial = 1;
    
    for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " +num + " : " +factorial);
}

}
}