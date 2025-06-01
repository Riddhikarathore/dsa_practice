package arrays;

public class movezeros {


    public static void moveZeros(int[] arr) {
        int j = 0;  // Pointer to place next non-zero element

        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
