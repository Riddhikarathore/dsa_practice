package binarysearch;

public class binarysearchoccurrenceL {

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;  // Go right to find last occurrence
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4};
        System.out.println(lastOccurrence(nums, 2));  // Output: 3
    }
}
