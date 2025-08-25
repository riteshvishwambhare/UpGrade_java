package BranchingStatement;

public class three {
    public static void main(String[] args) {
        System.out.println("Program for Found a number in array and break");
      int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int num = 5;
        for( int i=1; i<=arr.length; i++){
            if(arr[i]==num){
                System.out.println( " Number " + num + " found at index " + i);
                break;
            }
        }
    }
}
