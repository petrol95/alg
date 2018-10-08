/**
 * Algorithms and data structures. Lesson 1.
 *
 * @author Olga Petrova
 * @version dated Oct 08, 2018
 */

// Binary search algorithm
class BinarySearch {

    public static int search(int arr[], int n) { // returns place of searched item or (-1) otherwise
        int low = 0; // first element of checked part
        int high = arr.length - 1; // last element of checked part
        int mid = -1; // middle element
        int guess = -1; 
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == n) {
                guess = arr[mid]; // found
                break;
            }
            else if (arr[mid] > n)
                high = mid - 1; // shift the high bound
            else
                low = mid + 1; // shift the low bound
        }
        return guess;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 9}; // sorted array
        // positive test
        System.out.println((search(arr, 3) == -1) ? "Item wasn't found" : "Slot " + search(arr, 3));
        // negative test
        System.out.println((search(arr, -1) == -1) ? "Item wasn't found" : "Slot " + search(arr, -1));
    }
}