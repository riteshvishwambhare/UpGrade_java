package switchStatement;

import java.util.Scanner;

public class MenuDrivenaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Option");
         System.out.println(" 1 - New Game || 2 - Load Game || 3 - Exit");

         int Option = sc.nextInt();

         switch (Option) {
            case 1:
                System.out.println("New Game");
                break;
                 case 2:
                System.out.println("Load Game");
                break;
                 case 3:
                System.out.println(" Exit");
                break;
         
            default:
                System.out.println(" Wrong Choise..! select 1 2 3 ");
         }
         sc.close();
    }
}
