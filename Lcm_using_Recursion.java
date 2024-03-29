import java.util.Scanner;

public class Lcm_using_Recursion {
    static int lcm(int a,int b, int m)
    {
        m = m + b;
        if((m % a == 0) && (m % b == 0))
        {
            return m;

        }
        return lcm(a, b, m);
    }
    public static void main(String[] args) {
        int a, b , m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("LCM  = " + lcm(a, b, m));
        

    }
}
