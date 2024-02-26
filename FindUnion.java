import java.util.*;

public class FindUnion {
    public static void unionAll(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        // Print remaining elements of the first array
        while (i < m)
            System.out.print(arr1[i++] + " ");
        // Print remaining elements of the second array
        while (j < n)
            System.out.print(arr2[j++] + " ");
    }

    public static void main(String arg[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int m = arr1.length;
        int n = arr2.length;
        unionAll(arr1, arr2, m, n);
    }
}



