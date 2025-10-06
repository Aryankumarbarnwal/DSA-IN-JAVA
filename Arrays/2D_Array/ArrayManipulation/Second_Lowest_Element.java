// Second Largest Element in the Array


import java.util.Scanner;

public class Second_Lowest_Element {
    static int First_Lowest_num(int n, int arr[]){
        n = arr.length;
        int num = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<num){
                num = arr[i];
            }
            
        }
        return num;
    }

    static int Second_Lowest_num(int arr[], int n){
        n= arr.length;
        // int num = Integer.MIN_VALUE;
        int mx = First_Lowest_num(n, arr);
        for(int i=0;i<n;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int num = First_Lowest_num(n, arr);

        System.out.println("Ther Second Largest number is : "+num);

        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        First_Lowest_num(n, arr);
        Second_Lowest_num(arr, n);
    }
}
