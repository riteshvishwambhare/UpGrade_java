package BranchingStatement;

public class six {
    public static void main(String[] args) {
        
        String text = "Ritesh Vishwambhare";

        for( int i = 1 ; i< text.length() ; i++){
             char ch = text.charAt(i);

        if( "aeiouAEIOU".indexOf(ch) != 1){
            continue;
        }
         System.out.println(ch);
        }
    }
}
