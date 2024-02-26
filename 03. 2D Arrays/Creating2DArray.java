public class Creating2DArray {
    public static void insertValues(int[][] arr) {
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = val++;
            }
        }
    }
    
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Linear Search
    public static void linearSearch(int[][] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == data) {
                    System.out.println("Data found at: Row: " + i + " Col: " + j);
                    return;
                }
            }
        }

        System.out.println("Data not found");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr.length); // 3
        System.out.println(arr[0].length); // 4

        // Inserting values
        insertValues(arr);

        // Printing the array
        print(arr);

        // Linear Search
        linearSearch(arr, 5);

        // Memory Allocation of 2D Array

        // Generally, 2D array is stored in row-major order, i.e. the row elements are stored in contiguous memory locations.(1 row after another)
        // Second way to store is column-major order, i.e. the column elements are stored in contiguous memory locations.(1 column after another)

        // But in Java, majorily 2D array is stored randomly, i.e. the row elements are not stored in contiguous memory locations.
        // But, there starting address of each row is stored in a separate array, and the starting address of this array is stored in the main array.(like each element in major array is a pointer to the starting address of the row array)

    }
}
