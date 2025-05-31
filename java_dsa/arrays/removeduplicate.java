package arrays;

public class removeduplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 5, 4};

        int n = arr.length;
        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp array
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to temp
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        // print new array without duplicates
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }
    }


}
