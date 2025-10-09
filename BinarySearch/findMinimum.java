// WAP To find minimum or pivot element from the array

public class findMinimum {

    static int findMin(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            } else
                st = mid + 1;
        }
        return ans;
    }

    static int searchTarInd(int[] arr, int target) {
        int min = findMin(arr);
        int n = arr.length;
        int st = 0, end = n - 1;
        if (arr[0] > arr[n - 1]) {
            if (target == arr[min]) {
                return min;
            } else if (target < arr[0]) {
                st = min + 1;
            } else {
                end = min - 1;
            }
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        System.out.print(searchTarInd(arr, 3));
    }
}