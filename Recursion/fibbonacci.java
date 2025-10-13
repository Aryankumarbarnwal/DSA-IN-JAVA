import java.util.*;

public class fibbonacci {

    static int fib(int n){

        // base case
        if(n==0 || n==1){
            return n;
        }

        // calculation 
        return fib(n-1)+fib(n-2);

        // just for understanding how it works

        // int prev = fib(n-1);
        // int prePrev = fib(n-2);

        // return prev+prePrev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        System.out.println(" ");
        for(int i = 0;i<(n+1);i++){
            System.out.println(fib(i));
        }

        sc.close();
    }
    
}
