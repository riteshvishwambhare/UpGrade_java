package BranchingStatement;

public class Eight {
    public static void main(String[] args) {
        String text = " abcdefygjhxhiuhu";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'x') {
                System.out.println("  x  found at index: " + i);
                break; 
            }
        }
    }
}
