public class Missing_number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int sum1 = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum1 =  sum1 + arr[i];
        }
         int sum2 =  0;
         for(int i = 0; i<=6; i++)
         {
            sum2 = sum2 + i;
         }
         System.out.println("Missing number of an array = " +( sum2 - sum1));
    }
}
