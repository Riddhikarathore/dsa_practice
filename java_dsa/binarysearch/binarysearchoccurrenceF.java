package binarysearch;

public class binarysearchoccurrenceF {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;  // Go left to find first occurrence
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 6, 8};
        System.out.println(firstOccurrence(nums, 4));
    }


}
