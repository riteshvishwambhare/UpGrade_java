package BranchingStatement;

public class calculate_leaf {
    public static void main(String[] args) {

        for( int i=2000 ; i<= 2025 ; i++){
            if ((i % 4 == 0 && i % 100 !=0 )|| i % 400 ==0 ) {
                System.out.println( "the leaf yrs is : " +i );
            
          if( i % 2 == 0){
            System.out.println("even");
          }else{
            System.out.println("odd");
          }
        }
      }
    }
}
