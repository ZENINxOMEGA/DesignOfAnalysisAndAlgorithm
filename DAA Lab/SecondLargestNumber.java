public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        int[] result = findSecondLargest(arr, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.println("Second largest number is: " + result[1]);
    }

    static int[] findSecondLargest(int[] arr, int index, int max, int secondMax) {
        if (index == arr.length)
            return new int[]{max, secondMax};
        if (arr[index] > max) {
            secondMax = max;
            max = arr[index];
        } else if (arr[index] > secondMax && arr[index] != max) {
            secondMax = arr[index];
        }
        return findSecondLargest(arr, index + 1, max, secondMax);
    }
}
