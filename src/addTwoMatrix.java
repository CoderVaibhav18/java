import java.util.Scanner;

public class addTwoMatrix {
    public static void main(String[] args){

        int i,n,m,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dim =");
        m = sc.nextInt();
        n = sc.nextInt();
        int[] []a = new int[m][n];
        int[] []b = new int[m][n];
        System.out.println("Enter 1st matrix element");
        for (i = 0;i < m; i++) {
            for(j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("display 1st matrix");
        for(i = 0;i < n; i++) {
            System.out.println();
            for(j=0;j<n;j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("Enter 2nd matrix element");
        for (i = 0;i < m; i++) {
            for(j=0;j<n;j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println();


        System.out.println("display 2nd matrix");
        for(i = 0;i < n; i++) {
            System.out.println();
            for(j=0;j<n;j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Addition of two matrix");
        for(i = 0;i < n; i++) {
            System.out.println();
            for(j=0;j<n;j++) {
                System.out.print((a[i][j]+ b[i][j])+ " ");
            }
        }

    }
}
