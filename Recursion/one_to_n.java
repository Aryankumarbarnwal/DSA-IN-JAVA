// print the numbers from one to n

import java.util.Scanner;

public class one_to_n {

    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        printIncreasing(n);

        sc.close();
    }
    
}