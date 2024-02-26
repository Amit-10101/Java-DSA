public class CountingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];
        // why is max+1 used?
        // because the array is 0-based indexed, so the last index will be max-1
        // but we need to store the count of max as well, so we need to increase the size of the array by 1
        //  Example: arr = {5, 4, 3, 2, 1}
        //  max = 5
        //  count = new int[5+1] = new int[6]
        //  count[5] will store the count of 5
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[k] = i;
                k++;
                count[i]--;
            }
        }
    } // Time Complexity: O(n+k), Space Complexity: O(n+k)

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        
        System.out.println("Array before sorting: ");
        printArray(arr);

        countingSort(arr);

        System.out.println("\nArray after sorting: ");
        printArray(arr);
    }
}
