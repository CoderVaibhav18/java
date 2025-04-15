import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        int a, b, c, ch;
        System.out.println("Enter 2 numbers = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1. Add");
        System.out.println("2. sub");
        System.out.println("3. mul");
        System.out.println("4. div");
        System.out.println("Enter your choice = ");
        ch = sc.nextInt();
        switch (ch){
            case 1: {
                c = a + b;
                System.out.println("Add is = " + c);
                break;
            }
            case 2: {
                c = a - b;
                System.out.println("Sub is = " + c);
                break;
            }
            case 3: {
                c = a * b;
                System.out.println("Mul is = " + c);
                break;
            }
            case 4: {
                c = a / b;
                System.out.println("Div is = " + c);
                break;
            }
            default:
                System.out.println("Wrong choice");
        }
    }
}
