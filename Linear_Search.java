public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,3,1};
        int key = 1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("index number = " + i);
            }
        }
    }
}
