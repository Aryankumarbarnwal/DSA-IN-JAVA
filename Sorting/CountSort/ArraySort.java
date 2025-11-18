public class ArraySort {

    static int findMAx(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static void basicCountSort(int[] arr){
        int max = findMAx(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k]=i;
                k++;
            }
        }
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMAx(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){ //frequency Array 
            count[arr[i]]++;
        }

        for(int i=1;i<count.length;i++){ // prefix Array
            count[i] += count[i-1];
        }

        for(int i = n-1;i>=0;i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,4,5,2,2,5};
        // basicCountSort(arr);
        countSort(arr);
        display(arr); 
    }
}