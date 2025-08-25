package switchStatement;

import java.util.Scanner;

public class catagory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Catagory of Product like --> A for Apparel || E for Electronic || F for Food");
        char Option = sc.next().toUpperCase().charAt(0);

        switch (Option) {
            case 'A':
                System.out.println("Apparel");
                break;
             case 'E':
                System.out.println("Electronic");
                break;
             case 'F':
                System.out.println("Food");
                break;
            
        
            default:
                System.out.println("please select proper Option --> A , E , F");
        }

    }
}
