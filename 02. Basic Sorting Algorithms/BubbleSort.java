public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swapped = true;
                }
                // if (!swapped) {
                //     break;
                // }
            }
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

        bubbleSort(arr);

        System.out.println("\nArray after sorting: ");
        printArray(arr);
        
    }
}
