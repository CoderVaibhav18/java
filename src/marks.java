import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        int phy, chem, math, bio;
        int totalMarks, per;
        System.out.println("Enter the marks of 4 subjects = ");
        Scanner sc = new Scanner(System.in);
        phy = sc.nextInt();
        chem = sc.nextInt();
        math = sc.nextInt();
        bio = sc.nextInt();
        totalMarks = phy + chem + math + bio;
        per = totalMarks / 4;
        if (phy < 35 || chem < 35 || math < 35 || bio < 35) {
            System.out.println("fail");
        }
        else if(per >= 75){
            System.out.println("distinction");
        }
        else if(per >= 60 && per < 75){
            System.out.println("first");
        }
        else if(per >= 45 && per < 60) {
            System.out.println("second");
        } else if (per > 35) {
            System.out.println("third");
        }
    }
}
