// check whether the string is palindrome or not

import java.util.Scanner;

public class Palindrome_Of_String {
    
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";

        String smallAns = reverse(s, idx+1);

        return smallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        String x = reverse(s, 0);
        if(x.equals(s)){
            System.out.println("Yes, This is Palindrome.");
        }else{
            System.out.println("No, It is not Palindrome.");
        }
        sc.close();
    }
}
