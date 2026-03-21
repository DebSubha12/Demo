public class BitonicArrayMax {

    public static int findMaximum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is less than next, max lies on right side
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } 
            // Else max lies on left side (including mid)
            else {
                high = mid;
            }
        }

        return arr[low]; // or arr[high], both are same
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println("Maximum element is: " + findMaximum(arr));
    }
}