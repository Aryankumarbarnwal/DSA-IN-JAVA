import java.util.Scanner;

public class suffix_sum_Array {

    static int[] sum(int[] arr){
        int n = arr.length;
        int i = n-2;
        while (i >= 0) {
            arr[i] = arr[i] + arr[i + 1];
            i--;
        }
        return arr;
    }

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After suffix Sum : ");
        int[] ans = sum(arr);
        printArray(ans);
        
    }
    
}
