public class PivotArray {
    public static int findPivot(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    } // Time Complexity: O(log n), Space Complexity: O(1)

    public static int findPivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] < nums[right]) {
            return 0;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else {
                if (nums[mid] < nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    } // Time Complexity: O(log n), Space Complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int pivot = findPivot(arr, target);

        System.out.println("Index of Target: " + pivot);

        int pivotIndex = findPivotIndex(arr);
        System.out.println("Pivot Index of Rotated Array: " + pivotIndex);
    }
}
