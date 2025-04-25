import java.util.Scanner;

public class sumOfArr {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int i,n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.=");
        n = sc.nextInt();
        for (i = 0;i < n; i++)
            a[i] = sc.nextInt();
        for(i = 0;i < n; i++)
            sum += a[i];
        System.out.println("The sum is " + sum);
    }

}
