import java.util.Scanner;
public class NoOfEven {
    public static void main(String[] arg)
    {
        int i, n,e=0,o=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a No.");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i % 2 ==0)
            {
                e++;
            }
            else {
                o++;
            }
        }
    System.out.println("No. of even no="+e);
        System.out.println("no. of odd no."+o);
    }
}
