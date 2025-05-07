import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] arg){
        int i, n, key , idx = 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size =");
        n= sc.nextInt();
        int[] a = new int[n];
        int beg = 0, end = n-1;
        System.out.println("Enter array element");
        for(i=0; i<n; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter key");
        key= sc.nextInt();
        if(beg > end){
            System.out.println("NOT FOUND");
        }

        while(beg < end){
            int mid = (beg + end) / 2;
            if(a[mid] == key){
                idx = mid+1;
             break;
            }

             if(a[mid] > key){
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        System.out.println(key + " found at position " + idx);

    }
}
