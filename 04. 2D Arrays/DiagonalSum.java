public class DiagonalSum {
    public static void diagonalSum(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Primary Diagonal
            sum += arr[i][i];

            // Secondary Diagonal
            // i + j = n - 1
            // j = n - i - 1
            sum += arr[i][n-i-1];
        }

        if (n % 2 != 0) {
            sum -= arr[n/2][n/2];
        }

        System.out.println("Total: " + sum);
    } // Time Complexity: O(n), Space Complexity: O(1)

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        // int[][] arr = {
        //     {1, 2, 3},
        //     {5, 6, 7},
        //     {9, 10, 11},
        // };

        diagonalSum(arr);
    }
}
