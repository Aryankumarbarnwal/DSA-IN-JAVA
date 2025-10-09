// Search For the Target

import java.util.Arrays;

public class SearchTarget {

    static int[] searchRange(int[] nums,int target){
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int start = 0;
        int last = n-1;
        int[] fo = {-1, -1};
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target <= nums[mid]){
                fo[0] = mid;
                end = mid-1;
            }
            else 
                st = mid+1;
        }
        while(start <= last){
            int mid = start + (last-start)/2;
            if(target >= nums[mid]){
                fo[1] = mid;
                start = mid+1;
            }
            else 
                last = mid-1;
        }

        return fo;
    }
    
    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 10)));
    }
}
