// remove the character from the string
import java.util.*;

public class RemoveChar {

    // without Index
    static String Remove2(String s){
        // Base Case
        if(s.length() == 0) return " ";

        // Recursive Work
        String SmallAns = Remove2(s.substring(1));

        // Self Work
        char currChar = s.charAt(0);
        if(currChar != 'a') return currChar+ SmallAns;
        else {
            return SmallAns;
        }

    }

    // using index 
    static String RemoveOccurences(String s, int idx){
        // Base Case
        if(idx == s.length()) return " ";

        // Recursive Work
        String SmallAns = RemoveOccurences(s, idx+1);

        // Self Work
        char currChar = s.charAt(idx);
        if(currChar != 'a') return currChar+ SmallAns;
        else {
            return SmallAns;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();

        System.out.println(RemoveOccurences(s, 0));
        sc.close();
    }
}
