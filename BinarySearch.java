/**
 * Algorithms and data structures. Lesson 1.
 *
 * @author Olga Petrova
 * @version dated Oct 09, 2018
 */

// Binary search algorithm
class BinarySearch {

    public static void search(int arr[], int n) {
        int low = 0; // first element of checked part
        int high = arr.length - 1; // last element of checked part
        int mid = -1; // middle element
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == n) {
                System.out.println(n + " is the arr[" + mid + "]"); // found
                return;
            }
            else if (arr[mid] > n)
                high = mid - 1; // shift the high bound
            else
                low = mid + 1; // shift the low bound
        }
        System.out.println(n + " wasn't found");
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 9}; // sorted array
        // positive test
        search(arr, 7);
        // negative test
        search(arr, -1);
    }
}