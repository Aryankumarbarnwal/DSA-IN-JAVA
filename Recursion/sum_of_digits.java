import java.util.*;

public class sum_of_digits {

    static int sum(int n){

        // Base case
        if(n>=0 && n<= 9) return n;

        // find modulus
        // int mod = n%10;

        // return ans
        // int ans = mod + sum(n/10);

        return (sum(n/10) + n%10);
    }

    static int countDigit(int n){
        if(n/10 == 0){
            return 1;
        }

        return countDigit(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        System.out.println("Sum Of Digits : "+sum(n));
        System.out.println("Count of Digits: "+countDigit(n));
        sc.close();
    }
}
