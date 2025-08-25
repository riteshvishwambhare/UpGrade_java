package BranchingStatement;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Secrete Number");
        int SecreteNumber = 10;

        for(;;){
            System.out.println("Guess the Number");
            int guess = sc.nextInt();

            if( guess == SecreteNumber){
                System.out.println("***  Currect  ***");
                break;
            } else{
                System.out.println("+++ Wrong Number +++ ");
            }
        }
    }
}
