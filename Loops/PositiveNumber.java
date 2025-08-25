package Loops;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num;

        do{
            System.out.print("Enter the Positive Number : ");
            num = sc.nextInt();
        }
        while( num <= 0);
         System.out.println("you Enter Positive Number :" + num);
         sc.close();
    }
}
