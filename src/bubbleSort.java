import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        int n, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array = ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for(i = 0; i < n-1; i++){
            for(j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array is given below : ");
        for(i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}
