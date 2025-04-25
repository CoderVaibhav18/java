import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        int num1, num2;
        System.out.println("Enter two number = ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while (num1 != num2){
            if(num1>num2){
                num1 -= num2;
            }
            if(num2>num1){
                num2 -= num1;
            }
        }
        System.out.println("The GDC is " + num1);

    }
}
