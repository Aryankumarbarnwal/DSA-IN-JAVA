import java.util.Scanner;

public class ArraySort {
    static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                if(!flag) return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted Array: ");
        bubbleSort(arr, n);
        for(int i : arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}