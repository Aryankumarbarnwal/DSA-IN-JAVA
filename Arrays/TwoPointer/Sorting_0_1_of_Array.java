// Sort an Array consisting of only 0's and 1's 


package Two_Pointer;
import java.util.Scanner;



public class Sorting_0_1_of_Array {

    static void swap(int[] arr,int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void countingOfZeros(int[] arr){

        int n = arr.length;
        int left = 0;
        int right = (n-1);
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] == 0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }

    // static int[] sortingOfArray(int[] arr){
    //     int n = arr.length;
    //     int count = countingOfZeros(arr);
    //     for(int i = 0;i<count;i++){
    //         arr[i]=0;
    //     }
    //     for(int i=count;i<n;i++){
    //         arr[i]=1;
    //     }

    //     return arr;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("After Sorting : ");
        countingOfZeros(arr);
        for(int i=0 ;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
