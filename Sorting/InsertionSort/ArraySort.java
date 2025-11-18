import java.util.*;

public class ArraySort{
    static void InsertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                // Swap 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        InsertionSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}