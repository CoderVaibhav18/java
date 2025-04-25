import java.util.Scanner;

public class printRevNaturalNum {
    public static void main(String[] args){
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no. ");
        n = sc.nextInt();
        for(i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
