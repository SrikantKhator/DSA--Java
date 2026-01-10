public class ReverseArray {

    // Reverses the array in-place using two pointers
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// TC: O(N)
// SC: O(1)
