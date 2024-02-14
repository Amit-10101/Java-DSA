import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    // Brute Force Approach
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[] {};
    // } // Time Complexity: O(n^2), Space Complexity: O(1)

    // Optimized Approach using HashMap
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[] { numMap.get(diff), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    } // Time Complexity: O(n), Space Complexity: O(n)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        sc.close();

        int result[] = twoSum(arr, target);
        if (result.length == 0) {
            System.out.println("No such pair found!");
        } else {
            System.out.println("The indices of the pair are: " + result[0] + " and " + result[1]);
        }

    }
}
