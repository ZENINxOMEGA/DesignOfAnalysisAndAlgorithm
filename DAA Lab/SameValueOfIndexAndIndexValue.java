public class SameValueOfIndexAndIndexValue {
    public static void main(String[] args) {
        int[] arr = { -3, -1, 0, 2, 4, 5, 6, 8, 9, 12 };

        System.out.println("Indices where index == value:");
        findAllMagicIndices(arr, 0, arr.length - 1);
    }

    // Recursive method to find all matches
    static void findAllMagicIndices(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == mid) {
            System.out.println("Index: " + mid + " → Value: " + arr[mid]);
        }

        // Search left side if possible
        if (mid - 1 >= left) {
            findAllMagicIndices(arr, left, mid - 1);
        }

        // Search right side if possible
        if (mid + 1 <= right) {
            findAllMagicIndices(arr, mid + 1, right);
        }
    }
}
