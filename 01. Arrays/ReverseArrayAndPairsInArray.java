public class ReverseArrayAndPairsInArray {
    public static void reverseArray(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;
        
        // while (start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    } // Time complexity: O(n), Space complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Reversing an array
        // Reversing an array means the elements of the array will be stored in the reverse order.
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Pair in an array
        // A pair is a set of two elements that have a specific relationship with each other.
        System.out.println("Pairs in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
