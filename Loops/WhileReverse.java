package Loops;

public class WhileReverse {
    
    public static void main(String[] args) {
     int num =123;
     int r=0;

        while (num>0) {
            r = r*10 + (num%10);
            num = num /10;
          
        }
         System.out.println(r);
    }
}
