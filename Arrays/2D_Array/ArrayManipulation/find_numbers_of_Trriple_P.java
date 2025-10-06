import java.util.Scanner;

public class find_numbers_of_Trriple_P {
    static void sum (int arr[], int n, int target){
        int i,j,k;
        int count=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                        System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ", " +arr[k]+ ")");
                    }
                }
            }
        }
        System.out.println("Number of pairs with sum " + target + " is: " + count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter Array's Element ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search for pairing");
        int search = sc.nextInt();
        sum(arr, n, search);



        sc.close();
    }    
}
