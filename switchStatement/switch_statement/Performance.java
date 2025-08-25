import java.util.Scanner;

public class Performance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter the Grade ");
        char Grade = sc.next().toUpperCase().charAt(0);

        switch (Grade) {
            case 'A':
                System.out.println("Excellent");
                break;
                case 'B':
                System.out.println("Best");
                break;
                case 'C':
                System.out.println("Currect");
                break;
                case 'D':
                System.out.println("Decent");
                break;
                case 'E':
                System.out.println("Elegant");
                break;
                case 'F':
                System.out.println("Fail");
                break;
        
            default:
                System.out.println(" Please Enter Charector Between A and F ");
        }
    }
}
