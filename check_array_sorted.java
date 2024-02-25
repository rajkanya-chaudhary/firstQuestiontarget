public class check_array_sorted {
    static boolean isSorted(int arr[] , int n)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+ 1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    return false;
                }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5};
        int n = 5;
        System.out.println(isSorted(arr, n));

    }
}
