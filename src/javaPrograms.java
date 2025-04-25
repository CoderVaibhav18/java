// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class javaPrograms {

    public static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void printSquare(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("");
            System.out.println();
        }
    }

    public static void printInvertedPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void binToDec(int num){
        int n = num;
        int pow = 0;
        int dec = 0;
        while(n > 0){
            int ld = n % 10;
            dec += (ld*(int)(Math.pow(2, pow)));
            n = n / 10;
            pow++;
        }
        System.out.print(dec);
    }

    public static void decTobin(int n){
        int pow = 0;
        int bin = 0;
        while(n > 0){
            int rew = n % 2;
            bin += rew*(int)(Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.print(bin);
    }

    public static void hollowRectangle(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || j == 1 || i == rows || j == cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfInvertedRotatedPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfInvertedRotatedNumPyramid(int n){
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i+1); j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void floydsPyramid(int n){
        int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

    public static void binTrianle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        int rows = 4, cols = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= cols; j++){
                if(i == 1 || j==1 || i == rows || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfDiamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindrome(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for(int k = 2; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void revArr(int[] arr){
        int start = 0, end = arr.length-1;
        // while(start < end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }

        for(int i = start; i < end; i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            // start++;
            end--;
        }

    }

    public static void pairsArray(int[] arr){
        int n = arr.length;
        int tp = 0;

        for(int i = 0; i < n; i++){
            int curr = arr[i];
            for(int j = i+1; j < n; j++){
                System.out.print("("+curr+", "+ arr[j]+"), ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("tp = "+ tp);
    }

    public static void printSubArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void kadanesAlgo(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.print(ms); //7

    }

    public static void pyramidevv(int n){
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                if(i == j){
                    num++;
                }else{
                    num+=2;
                }
            }
            System.out.println();
        }

    }

    public static void evvOddPyramid(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                if(i==j){
                    num++;
                }else{
                    num+=2;
                }
            }
            System.out.println();
        }
    }

    public static void patternPalindrome(int n){

        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j+ " ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }

    public static int linearsearch(int[] arr, int key){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;

    }

    public static int largestNum(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("largest numbers is " + largest);
        System.out.println("AND");
        return smallest;
    }

    public static void reverseArr(int[] arr){
        int n = arr.length;
        int start = 0, end = n - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void paisOfArr(int[] arr){
        int n = arr.length;
        int tp = 0;
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            for(int j = i+1; j < n; j++){
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        paisOfArr(arr);
        // for(int i = 0; i< arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}