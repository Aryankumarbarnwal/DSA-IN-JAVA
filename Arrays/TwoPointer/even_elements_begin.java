// Sort the Array as all even elements should come at begin in any ordered

package Two_Pointer;
import java.util.Scanner;

public class even_elements_begin {
    static void swap(int[] arr,int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sorting(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
             if (arr[i] % 2 == 1 && arr[j] % 2 == 0) { // Odd at i, Even at j
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) { // If `i` is already even, move forward
                i++;
            }
            if (arr[j] % 2 == 1) { // If `j` is already odd, move backward
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sorting(arr);

        System.out.println("After Sorting : ");
        for(int i=0 ;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
    

