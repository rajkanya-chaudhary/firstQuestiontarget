public class Removeduplicatearray {
    public static void main(String[] args) {
        int arr1[] = {4, 6, 8, 6, 3, 1, 2, 3, 2, 3, 8};
        int index = 0;

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] != arr1[index]) {
                index++;
                arr1[index] = arr1[i];
            }
        }

        // Increment index to get the length of the array without duplicates
        index++;

        // Print the modified array
        for (int i = 0; i < index; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    
}
