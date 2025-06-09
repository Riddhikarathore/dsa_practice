package patterns;

public class patternmejority {
    public static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = -1;

        // Phase 1: Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
}
