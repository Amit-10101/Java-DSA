public class MinAndMaxInArray {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    } // Time complexity: O(n), Space complexity: O(1)

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    } // Time complexity: O(n), Space complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Finding the maximum in an array
        System.out.println("Maximum in the array: " + findMax(arr)); // 50

        // Finding the minimum in an array
        System.out.println("Minimum in the array: " + findMin(arr)); // 10
    }
}
