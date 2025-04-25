import java.lang.*;
import java.util.Scanner;

class PrintNaturalNo {
    public static void main(String[] arg)
    {
        int i,n,sum=0;
        double avg;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no. ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            sum=sum+i;

        }
        System.out.println("Sum="+sum);
          avg=sum/n;
        System.out.println("Average="+avg);

    }
}
