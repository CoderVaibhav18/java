import java.util.Scanner;

public class traversalArray {
    public static void main(String[] args){

        int i,n,m,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dim =");
        m = sc.nextInt();
        n = sc.nextInt();
        int[] []a = new int[m][n];
        System.out.println("Enter element");
        for (i = 0;i < m; i++) {
            for(j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(i = 0;i < n; i++) {
            System.out.println();
            for(j=0;j<n;j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
