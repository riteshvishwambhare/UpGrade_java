import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of Double b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of character c");
        char c = sc.next().charAt(0);
        
        System.out.println(" Enter the value of boolean e");
        boolean e = sc.nextBoolean();
        System.out.println("enter the value of float f");
        float f = sc.nextFloat();
        System.out.println("Enter the value of String d");
        String d = sc.next();
        sc. close();
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);  
        System.out.println("The value of c is: " + c);
        System.out.println("The value of d is: " + d);
        System.out.println("The value of e is: " + e);
        System.out.println("The value of f is: " + f);


    }
}
