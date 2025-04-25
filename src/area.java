import java.util.Scanner;

public class area {
    public static void main(String[] args){
        int r, ch;
        double c;
        System.out.println("Enter radius = ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("1. circle");
        System.out.println("2. sphere");
        System.out.println("Enter choice = ");
        ch = sc.nextInt();
        switch (ch){
            case 1: {
                c = 2 * 3.14 * r * r;
                System.out.println("Area of circle = " + c);
                break;
            }
            case 2: {
                c = 3.14 * r * r;
                System.out.println("Area of sphere = " + c);
                break;
            }
        }

    }
}
