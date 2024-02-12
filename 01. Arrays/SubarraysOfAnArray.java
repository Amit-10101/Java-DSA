public class SubarraysOfAnArray {
    public static void printSubarrays(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Max of Sub Arrays: " + max);
        System.out.println("Min of Sub Arrays: " + min);
    } // Time Complexity: O(n^3), Space Complexity: O(1)

    public static void prefixMaxMinSubarray(int[] arr) {
        int[] prefix = new int[arr.length];

        // Making Prefix Array
        // Q: What is the prefix array?
        // A: The prefix array is an array that stores the sum of all the elements from the start of the array to the current index.
        // Prefix Array: [10, 30, 60, 100, 150]
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Finding the max and min of subarrays using the prefix array
        // Prefix Formula: prefix[end] - prefix[start - 1]
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("Max of Sub Arrays: " + max);
        System.out.println("Min of Sub Arrays: " + min);
    } // Time Complexity: O(n^2), Space Complexity: O(n)

    public static void kadane(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        // Kadane's Algorithm
        // Q: What is Kadane's Algorithm?
        // A: Kadane's Algorithm is an algorithm that is used to find the maximum sum of a subarray in an array.
        // It says that if the current sum is less than 0, then we should reset the current sum to 0.
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (currSum > max) {
                max = currSum;
            }
        }

        // If all the elements are negative
        if (max == 0) {
            max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        System.out.println("Max of Sub Arrays: " + max);
    } // Time Complexity: O(n), Space Complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {-10, -20, -30, -40, -1000};

        System.out.println("PRINTING SUBARRAYS USING BRUTE FORCE : ");
        printSubarrays(arr);

        System.out.println();
        System.out.println("PRINTING MAX-MIN USING PREFIX SUM ARRAY : ");
        prefixMaxMinSubarray(arr);

        System.out.println();
        System.out.println("PRINTING MAX SUBARRAYS SUM USING KADANE'S ALGORITHM : ");
        kadane(arr);
    }
}
