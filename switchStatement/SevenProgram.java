package switchStatement;

import java.util.Scanner;

public class SevenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number ----> like 1,2,3 ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
        
            default:
               System.out.println("Invalid Input please put Currect Input");
        }
        sc.close();
    }
}
