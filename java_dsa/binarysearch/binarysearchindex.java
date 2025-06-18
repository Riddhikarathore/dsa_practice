package binarysearch;

public class binarysearchindex {

    public static int searchIndex(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(searchIndex(nums, 5));
    }
}
