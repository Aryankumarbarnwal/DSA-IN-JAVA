// print all natural numbers from n to 1
import java.util.Scanner;

public class n_to_one {
    static void printDecreasing(int n){
        System.out.println(n);
        if(n==1){
            // System.out.println(n);
            return;
        }

        printDecreasing(n-1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(" ");
        printDecreasing(n);

        sc.close();
    }
}
