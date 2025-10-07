// Querry based Prefix Sum will be printed here means there is querry that l means first index to r means last index print prefix sum
import java.util.Scanner;


public class L_to_R_prefix_sum {
    static int[] Prefsum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // Use i < n for 0-based indexing
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Use 0-based indexing
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) { // Use 0-based indexing
            arr[i] = sc.nextInt();
        }

        System.out.println("After Prefix Sum : ");
        int[] ans = Prefsum(arr);
        printArray(ans);

        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range : ");
            int l = sc.nextInt(); // 1-based input
            int r = sc.nextInt(); // 1-based input

            // Convert to 0-based indexing
            int total = ans[r - 1] - (l > 1 ? ans[l - 2] : 0);
            System.out.println("sum = " + total);
        }
    }
}
