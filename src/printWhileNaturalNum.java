import java.util.Scanner;

public class printWhileNaturalNum {
    public static void main(String[] args){
        int i , n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        n = sc.nextInt();
        i = n;
        while (i >= 1){
            System.out.println(i);
            i--;
        }
    }
}
