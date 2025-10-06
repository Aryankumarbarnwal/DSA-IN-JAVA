public class sum_of_array {
    public static void main(String[] args) {
        int arr[] ={ 1, 5, 3};
        int temp = 0;
        for(int sum : arr){
            temp += sum;
        }
        System.out.println(temp);
    }
}
