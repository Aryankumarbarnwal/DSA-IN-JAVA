// print the kth time multiple of the number
// k = 2 so, 12*1=12, 12*2=24 and so on
import java.util.*;

public class k_multiples {

    static void multiple(int n, int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
        multiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. ");
       int n = sc.nextInt();
       System.out.println("Enter time of multiplication : ");
       int k = sc.nextInt();
       System.out.println(" ");
       multiple(n, k);

       sc.close();
    }
}
