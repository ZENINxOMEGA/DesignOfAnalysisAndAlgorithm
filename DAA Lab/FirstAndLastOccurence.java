public class FirstAndLastOccurence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 3, 4};
        int target = 2;

        int first = findFirstOccurrence(arr, target, 0, arr.length - 1);
        int last = findLastOccurrence(arr, target, 0, arr.length - 1);

        if (first != -1 && last != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + first);
            System.out.println("Last occurrence of " + target + " is at index: " + last);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Recursive Binary Search for first occurrence
    static int findFirstOccurrence(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            int earlier = findFirstOccurrence(arr, target, left, mid - 1);
            return (earlier != -1) ? earlier : mid;
        } else if (arr[mid] > target) {
            return findFirstOccurrence(arr, target, left, mid - 1);
        } else {
            return findFirstOccurrence(arr, target, mid + 1, right);
        }
    }

    // Recursive Binary Search for last occurrence
    static int findLastOccurrence(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            int later = findLastOccurrence(arr, target, mid + 1, right);
            return (later != -1) ? later : mid;
        } else if (arr[mid] > target) {
            return findLastOccurrence(arr, target, left, mid - 1);
        } else {
            return findLastOccurrence(arr, target, mid + 1, right);
        }
    }
}
