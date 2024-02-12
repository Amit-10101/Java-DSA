public class ArraySearching {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    } // Time complexity: O(n), Space complexity: O(1)

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start >= end) {
            int mid = start + (end - start) / 2;
            if (target == mid) {
                return mid;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    } // Time complexity: O(log n), Space complexity: O(1)
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        // Searching in an array
        // Searching is the process of finding a particular element in the array.
        // There are two types of searching:

        // 1. Linear Search
        // Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one. 
        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        // 2. Binary Search
        // Binary search is a fast search algorithm with run-time complexity of O(log n).
        // This search algorithm works on the principle of divide and conquer.
        // For this algorithm to work properly, the data collection should be in a sorted form.
        // Binary search looks for a particular item by comparing the middle most item of the collection.
        // If a match occurs, then the index of item is returned.

        int binarySearchResult = linearSearch(arr, key);
        if (binarySearchResult != -1) {
            System.out.println("Element found at index: " + binarySearchResult);
        } else {
            System.out.println("Element not found");
        }
    }
}
