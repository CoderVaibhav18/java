import java.util.Scanner;

public class greatestNumInArr {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int i,n , max;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.=");
        n = sc.nextInt();
        for (i = 0;i < n; i++) {
            a[i] = sc.nextInt();
        }
        max=a[0];
        for(i = 1;i < n; i++){
           if (max < a[i]) {
               max = a[i];
           }
        }
        System.out.println(max);
    }
}
