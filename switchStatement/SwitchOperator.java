package switchStatement;

import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int a =sc.nextInt();
        System.out.println("Enter the Operator ( + , - , * , / )");
        char Operator =sc.next().charAt(0);
        System.out.println("Enter a Second Number");
        int b =sc.nextInt();

        double result;

        switch (Operator) {
            case '+' :
                result = a + b;
                System.out.println("Addition is :" + result);
                break;
                 case '-' :
                result = a - b;
                System.out.println("Subtraction is :" + result);
                break;
                 case '*' :
                result = a * b;
                System.out.println("Multiplication is :" + result);
                break;
                 case '/' :
                result = a / b;
                System.out.println("division is :" + result);
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
