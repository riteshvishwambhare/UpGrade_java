package Loops;

import java.util.Scanner;

import BranchingStatement.six;

public class NumberDigit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Program for Counting Given Number");
       int num= 7779798;
       int count =0;
       while ( num > 0) {
         num = num / 10;
         count++;
         System.out.println( +count);
       }
    }
}
