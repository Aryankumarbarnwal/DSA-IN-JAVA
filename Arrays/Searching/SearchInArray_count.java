
// SEARCH ARRAY ELEMENTS AND COUNT IT 

import java.util.Scanner;
import javax.swing.TransferHandler;

class SearchinArray_count{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x, count = 0; 
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be search and count : ");
        x = sc.nextInt();

        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);

       
    }

}