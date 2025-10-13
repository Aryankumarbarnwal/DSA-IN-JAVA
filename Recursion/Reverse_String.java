// Print Reverse Of String 
import java.util.*;

public class Reverse_String {
    static String reverse(String s, int idx){
        if(idx == s.length()) return " ";

        String smallAns = reverse(s, idx+1);

        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();

        System.out.println(reverse(s, 0));
        sc.close();
    }
}
