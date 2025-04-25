import java.util.Scanner;

public class complexNum {
    public static void main(String[] args){
        int i1, j1, i2, j2, sumi, sumj;
        System.out.println("Enter number i & j 2 times = ");
        Scanner sc = new Scanner(System.in);
        i1 = sc.nextInt();
        i2 = sc.nextInt();
        j1 = sc.nextInt();
        j2 = sc.nextInt();
        sumi = i1 + i2;
        sumj = j1 + j2;
        System.out.println("A = " + i1 + "i" + " + " + j1 + "j");
        System.out.println("B = " + i2 + "i" + " + " + j2 + "j");
        System.out.println("A + B = " + sumi + "i" +" + "+ sumj + "j");
    }
}
