import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args){
        int n, i, j, count = 1;
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
