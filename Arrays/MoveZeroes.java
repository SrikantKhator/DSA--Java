public class MoveZeroes {

    // Moves all zeroes to the end while maintaining order of non-zero elements
    public static void moveZeroes(int[] arr) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, array is already valid
        if (j == -1) return;

        // Swap non-zero elements with zero position
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

// TC: O(N)
// SC: O(1)
