public class FloorCeilElement {

    public static int FloorElementSortedArray(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] <= target) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int CeilElementSortedArray(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] <= target) {

                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int target = 7;
        int floor = FloorElementSortedArray(arr, target);
        int ceil = CeilElementSortedArray(arr, target);
        System.out.println("Floor index: " + floor);
        System.out.println("Floor value: " + arr[floor]);

        System.out.println("Ceil index: " + ceil);
        System.out.println("Ceil value: " + arr[ceil]);
    }
}
