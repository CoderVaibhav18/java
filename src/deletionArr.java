import java.util.Scanner;

public class deletionArr {
    public static void main(String[] args){
        int n, p, i, deletedElement= 0 ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array = ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter  position");
        p = in.nextInt();
        deletedElement = a[p-1];
        for(i = p-1; i < n-1; i++){
            a[i] = a[i+1];
        }

        n--;
        for(i = 0; i < n; i++){
            System.out.println(a[i]);
        }
        System.out.println("deleted element = " + deletedElement);
    }
}
