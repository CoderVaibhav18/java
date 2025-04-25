import java.util.Scanner;

public class priramid {
    public static void main(String[] args){
        int n, i, j;
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(i );
            }
            System.out.println();
        }
        for(i = n; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
