import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

        // Sorting in descending order
        // Collections.reverseOrder() is used to sort the array in descending order
        // But it does not work for primitive data types like int, char, etc.
        // Instead, we can use Integer[] instead of int[] to sort the array in descending order

        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println("Array after sorting in descending order: ");
        System.out.println(Arrays.toString(arr1));

        //  Sorting only a part of the array
        int arr2[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(arr2, 0, 3);

        System.out.println("Array after sorting only a part of the array: ");
        System.out.println(Arrays.toString(arr2));
    }
}
