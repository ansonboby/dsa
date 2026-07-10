import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // ---- 1D Arrays ----
        int[] arr = {5, 2, 8, 1, 9};
        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // reverse (no built-in, do manually)
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(arr));

        // copy
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // fill
        int[] filled = new int[5];
        Arrays.fill(filled, 42);
        System.out.println("Filled: " + Arrays.toString(filled));

        // ---- 2D Arrays ----
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        // diagonal elements
        System.out.print("Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}

/*
--- EXERCISES ---
1. Find the maximum element in an array (write a method)
2. Check if two arrays are equal (without using Arrays.equals)
3. Generate and print a 5x5 identity matrix (1s on diagonal, 0s elsewhere)
*/
