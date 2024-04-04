public class TransposeMatrix {
    public static void transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] ans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        // Without using extra space, but only for square matrix
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < m; j++) {
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[j][i];
        //         arr[j][i] = temp;
        //     }
        // }
        System.out.println("Transposed Matrix:");
        print(arr);
    } // Time Complexity: O(n*m), Space Complexity: O(n*m)

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        print(arr);

        // transpose(arr);
    }
}
