// linearSearch problem 
// if element exist in array then return true and false
import java.util.*;

public class Linear_Search {

    // to find the index of the element 
    // static void findAllIndexes(int[] a,int n, int target, int idx){
    //     if(idx >= n) return;
        
    //     if(a[idx] == target) System.out.println(idx);;
    //     findAllIndexes(a, n, target, idx+1);
    // }
    // Find element using ArrayList
    static ArrayList<Integer> allIndices(int[] a,int n, int target, int idx){
        if(idx >= n) return new ArrayList<Integer>();

        ArrayList<Integer> ans = new ArrayList<>();
        if(a[idx] == target) ans.add(idx);

        ArrayList<Integer> smallAns = allIndices(a, n, target, idx+1);
        
        ans.addAll(smallAns);
        return ans;
    }

    // search element in the array
    static boolean search(int[] a, int n, int target, int idx){
        if(idx >= n) return false;

        if(a[idx] == target) return true;

        return search(a, n, target, idx+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter Target to Find : ");
        int target = sc.nextInt();
        int[] a= new int[n]; 
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(" ");
        if(search(a, a.length, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(" ");
        // findAllIndexes(a, n, target, 0);

        ArrayList<Integer> ans = allIndices(a, n, target, 0);
        for(Integer i: ans){
            System.out.println(i);
        }
        sc.close();
    }
}
