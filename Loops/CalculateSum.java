package Loops;

public class CalculateSum {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;

        while(i<=100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1 To 100 is : " +sum);
    }
}
