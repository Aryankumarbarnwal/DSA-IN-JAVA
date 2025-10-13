import java.util.*;

public class p_power_q {

    static double power(double p, int q){
        // this is the brute force aproach
        // {
        //     // Base case
        // if(q==0){
        //     return 1;
        // }

        // // calculation
        // return power(p, q-1)*p;
        // }

        // optimized
        double smallAns = power(p, q/2);

        if(q < 0){
            if(q%2==0){            
                return 1/(smallAns*smallAns);
            }
            else{
                return 1/(p*smallAns*smallAns);
            }
        }
        if(q == 0){
            return 1;
        }
        
        if(q%2==0){            
            return smallAns*smallAns;
        }
        else{
            return p*smallAns*smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base.");
        double p = sc.nextInt();
        System.out.println("Enter power : ");
        int q = sc.nextInt();

        System.out.println(" ");
        System.out.println(power(p, q));

        sc.close();
    }
}
