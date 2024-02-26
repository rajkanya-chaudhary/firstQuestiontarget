public class largestnumber {
    public static void main(String[] args) {
        int arr[] = {22,44,66,88,90};
        int largest  = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
