package PatternPrinitng;
/*
****
*  *
*  *
****

 */

import java.util.Scanner;

public class pattern2{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the number of rows and columns
        System.out.println("Enter Row: ");
        int r = sc.nextInt();
        System.out.println("Enter Column: ");
        int c = sc.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= r; i++) {
            // Loop through each column
            for (int j = 1; j <= c; j++) {
                if(i==1 || i==r || j== 1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all columns for the current row
            System.out.println();
        }
        
        // Close the scanner
        sc.close();
    }
}
