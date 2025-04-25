import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.=");
        n = sc.nextInt();
        for (i = 0;i < n; i++)
            a[i] = sc.nextInt();
        for(i = n-1;i >= 0; i--)
            System.out.println(a[i]);
    }
}
