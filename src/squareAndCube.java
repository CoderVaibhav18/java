import java.util.Scanner;

class squareAndCube {
    public static void main(String[] args){
        int n, i;
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + j);
            }
            System.out.println();
        }
    }
}
