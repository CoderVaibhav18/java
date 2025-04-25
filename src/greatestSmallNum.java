import java.util.Scanner;

public class greatestSmallNum {
    public static void main(String[] args)
    {
        int[] a= new int[5];
        int i,n , max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.=");
        n = sc.nextInt();
        for (i = 0;i < n; i++) {
            a[i] = sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(i = 1;i < n; i++){
            if (max < a[i]) {
                max = a[i];
            }
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("Greatest num is " + max);
        System.out.println("Smallest num is " + min);
    }
}
