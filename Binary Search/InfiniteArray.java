public class InfiniteArray {

    public static int findposition(int arr[], int target) {
        int low = 0, high = 1;
        while (target > arr[high]) {
            low = high;
            high = high * 2;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        int result = findposition(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
