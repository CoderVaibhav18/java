 import java.util.Scanner;
class twoKaTable
{
    public static void main(String[] arg)
    {
        int i, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        n = sc.nextInt();
        for(i=1;i<=10;i++) {
            System.out.println(n + " X " + i + " = " + i*n);
        }
    }
}
