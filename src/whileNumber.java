import java.sql.SQLOutput;
import java.util.Scanner;
public class whileNumber {
    public static void main(String[] arg)
    {
        int i=1, n, j=1, count= 1;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a no.");
        n=sc.nextInt();
        while(i<=n)
        {
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
