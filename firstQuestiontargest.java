public class firstQuestiontargest {

    public static void main(String[] args) {
        int arr[] = {2,7,9,8,12};
        int target = 10;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+ 1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                   // System.out.println(arr[i] + " " + arr[j]);
                   System.out.println("index number = (" + i + "," + j + ")");

                }
            }
        }
    }
}