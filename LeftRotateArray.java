public class LeftRotateArray {

    /*
     * Approach:
     * 1. Store the first element in a temporary variable.
     * 2. Shift all remaining elements one position to the left.
     * 3. Place the stored element at the last index.
     */

    public static void rotateArray(int[] arr) {
        if (arr.length <= 1) return;

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
