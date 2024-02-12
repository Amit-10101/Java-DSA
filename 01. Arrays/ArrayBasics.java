import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        // Q: What is an array?
        // A: An array is a collection of similar type of elements that are in a contiguous memory location.
        
        // Q: What type of data structure is an array?
        // A: An array is a linear data structure.

        // Creating an array
        int[] arr = new int[5];

        // The above line creates an array of 5 integers.
        // The array is created in the heap memory.
        // The array is initialized with default values (0 for integers).
        // The array is created with the index 0 to 4.
        
        // Accessing an array
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        
        // Assigning values to an array
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20

        // Iterating through an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        } // 10 20 0 0 0
        System.out.println();

        // Taking input for an array
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter 5 elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Printing an array
        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Length of an array
        System.out.println("Length of array: " + arr.length); // 5

        // When are arrays are passed in a function, they are passed by reference, unlike primitive data types(int,...).
    }
}
