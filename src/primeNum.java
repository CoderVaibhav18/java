import java.util.Scanner;

public class primeNum {
    public static void main(String[] args){
        int n , i = 2;
        boolean isPrime = true;
        System.out.println("Enter number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while( i < n){
            if((n%i) == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        System.out.println(isPrime);
    }
}
