package binarysearch;

public class binarysearchelement {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};
        System.out.println(binarySearch(nums, 10));  // Output: true
    }


}
