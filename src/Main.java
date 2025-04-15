
import java.lang.*;
import java.util.Scanner;

class quadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, x;
        double x1, x2;
        System.out.println("Enter the value of a, b, c= ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = b * b - 4 * a * c;
        if(d > 0){
            System.out.println("Roots are real and different");
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("x1 = " + x1 + "x2 = " + x2);
        }
        else{
            if(d == 0){
                System.out.println("roots are real and equal");
                x = -b/(2*a);
                System.out.println("x = " + x);
            }
            else{
                System.out.println("roots are imaginary");
            }
        }
    }
}