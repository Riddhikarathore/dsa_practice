package arrays;

public class KadanesAlgorithm {


    public static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];         // Sabse pehle element ko assume karo max
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Current element add karo ya naye se start karo — jo better ho
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Max update karo agar current sum zyada ho
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}
