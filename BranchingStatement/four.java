package BranchingStatement;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("Enter a number 0 to exit : ");
            int num = sc.nextInt();
            if (num == 0){
                System.out.println("Exit the loop");
            break;
            }
             System.out.println("You entered: " + num );
        }
       
        sc.close();
    }
}
