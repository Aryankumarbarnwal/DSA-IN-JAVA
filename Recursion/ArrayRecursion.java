import java.util.Scanner;

public class ArrayRecursion {

    // Printing Array Using Recursion method
    static void printArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;

        System.out.println(arr[idx]);

        printArray(arr, idx + 1);
    }

    // Find the max value of the Array
    static int maxvalue(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];
        int smallAns = maxvalue(arr, idx + 1);

        return Math.max(smallAns, arr[idx]);
    }

    // Adding Array Element using recursion
    static int Add(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];
        int smallAns = Add(arr, idx + 1);

        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Arrays: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        printArray(arr, 0);
        System.out.println(maxvalue(arr, 0));
        System.out.println(Add(arr, 0));
        sc.close();
    }
}
