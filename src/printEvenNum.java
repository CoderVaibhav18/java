import java.util.Scanner;

public class printEvenNum {
    public static void main(String[] args){
        int n, i, sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            if(i%2 == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The sum of even number is = "+ sum);
    }
}
