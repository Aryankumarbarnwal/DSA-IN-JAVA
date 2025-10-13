// given a number n. find the sum of natural numbers till n but with alternate signs
import java.util.*;

public class Alternate_sum_series {

    static int series(int n){
        if(n == 0) return 0;

        if(n%2==0)
            return series(n-1)-n;
        else 
            return series(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        System.out.println(series(n)); 
        sc.close();
    }
}
