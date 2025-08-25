package BranchingStatement;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for( int i = 1 ; i<=50 ; i++){
            if (i == 30) {
                break;
            }
            if (i % 2 ==0) {
                System.out.println( i);
            }
        }
    }
}
