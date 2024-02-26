public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    } // Time Complexity: O(n^2), Space Complexity: O(1)

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        
        System.out.println("Array before sorting: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nArray after sorting: ");
        printArray(arr);
    }
}
