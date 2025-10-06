import java.util.*;

class greatest {
    void arraysgreatestelement (){
        int arr[] = {2,5,6,7,8,10};
        int temp = 0;
        for(int i=0;i<arr.length; i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
            
        }
        System.out.println(temp);
    }
    
}

public class greatest_in_array {
    public static void main(String[] args) {
        greatest obj = new greatest();
        obj.arraysgreatestelement();
    
    }
}
