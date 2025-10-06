import java.util.Scanner;


public class Search_Elements_by_queries {
    static int[] searching(int[] arr){
        int n=arr.length;
        int frequ[] = new int[100005];
        for(int i =0;i<n;i++){
            frequ[arr[i]]++;
        }
        
        return frequ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element : ");
        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int[] frequ = searching(arr);
        System.out.println("Enter the number of queries : ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the querry : ");
            int x = sc.nextInt();
            if(frequ[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            q--;
        }
    }
}
