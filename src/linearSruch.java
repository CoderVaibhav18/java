import java.util.Scanner;
public class linearSruch {
public static void main(String[] arg){
    int i, n, item , loc = 0 ;

    Scanner sc= new Scanner(System.in);
    System.out.println("enter a size =");
    n= sc.nextInt();
    int a[]= new int[n];
    System.out.println("Enter array element");
    for(i=0; i<n; i++)
    {
        a[i]= sc.nextInt();
    }
    System.out.println("Enter key");
    item= sc.nextInt();
    for (i=0;i<n;i++)
    {
        if(a[i] == item)
        {
            loc=i+1;
        }

    }
    System.out.println(item + " found at position " + loc);
}
}

