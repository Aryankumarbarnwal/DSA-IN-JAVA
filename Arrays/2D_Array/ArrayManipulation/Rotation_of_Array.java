// // Rotation of an Array kth Times

// import java.util.Scanner;


// class Rotation_of_Array{
//     static int[] rotation(int[] arr, int k){
//         int n = arr.length;
//         int j=0;
//         k=k%n;
//         int[] ans = new int[n];
//         for(int i=n-k;i<n;i++){
//             ans[j++] = arr[i];
//         }
//         for(int i=0;i<n-k;i++){
//             ans[j++] = arr[i];
//         }

//         return ans;
//     }
//     static void printArray(int[] arr){
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Length of Array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter Element : ");
//         for(int i = 0 ;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter How much Time you want to Rotate : ");
//         int k = sc.nextInt();
//         System.out.println("Array Elements Before Rotation : ");
//         printArray(arr);
//         int[] ans = rotation(arr, k);
//         System.out.println("Before Rotation : ");
//         printArray(ans);

//     }
// }




// Rotation of an Array Elements without using extra space as above ans array


import java.util.Scanner;

class Rotation_of_Array{

    static void swap(int[] arr, int i,int n){
        n = arr.length;
        for(i=0;i<n;i++){
            arr[i] = arr[n-1];
            // n--;
        }
    }
    static void reverse(int arr[], int i, int j){
        // int n = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int[] rotation(int[] arr, int k){
        // int i, j;
        int n = arr.length;
        k=k%n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element : ");
        for(int i = 0 ;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter How much Time you want to Rotate : ");
        int k = sc.nextInt();
        System.out.println("Array Elements Before Rotation : ");
        int[] ans = rotation(arr, k);
        System.out.println("Before Rotation : ");
        printArray(ans);

        
    }
}