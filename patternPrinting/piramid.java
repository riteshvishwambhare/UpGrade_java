package patternPrinting;

public class piramid {
    public static void main( String args[]){
        for ( int i = 1; i <= 5; i++){

            //for spaces
            for( int j= 1 ; j <= 5 - i; j++){
                System.out.print(" ");
            }
            //for Star
            for( int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
