public class SearchInSortedMatrix {
    // This problem is also known as "Staircase Search"
    public static void searchInSortedMatrix(int[][] arr, int data) {
        int n = arr.length;
        int m = arr[0].length;
        int row = 0;
        int col = m-1;

        while (row < n && col >= 0) {
            int ref = arr[row][col];
            if (data == ref) {
                System.out.println("Data found at ( " + row + ", " + col + " )");
                return;
            } else if (data > ref) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Data not found!");
    } // Time Complexity: O(n+m), Space Complexity: O(1)
    // O(n+m) because in worst case, we have to traverse all the rows and all the columns

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int data = 0;
        searchInSortedMatrix(arr, data);
    }
}
