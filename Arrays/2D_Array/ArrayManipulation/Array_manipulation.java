// finding unique Element from an Array

import java.util.Scanner;


public class Array_manipulation{

    static void find_uniqueElement(int[] arr, int n){
        n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>ans){
                System.out.println("Unique Element is : "+arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n =sc.nextInt();
        System.out.println("Enter Array element : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        find_uniqueElement(arr,n);

        sc.close();
    }
}