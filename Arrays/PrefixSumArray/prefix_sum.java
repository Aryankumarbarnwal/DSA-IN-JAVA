
import java.util.Scanner;

public class prefix_sum {

    static int[] sum(int[] arr) {
        // arr[-1] = 0;
        int n = arr.length;
        int i = 1;
        while (i < n) {
            arr[i] = arr[i] + arr[i - 1];
            i++;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
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
        System.out.println("After Prefix Sum : ");
        int[] ans = sum(arr);
        printArray(ans);
        
    }

}
