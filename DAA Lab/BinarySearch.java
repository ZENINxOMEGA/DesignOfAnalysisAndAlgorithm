public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }

    static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Target not found
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Found
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target); // Right half
        } else {
            return binarySearch(arr, left, mid - 1, target); // Left half
        }
    }
}
