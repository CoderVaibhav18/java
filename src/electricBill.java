import java.util.Scanner;
public class electricBill {
    public static void main(String[] args){
        int cr, lr, unit;
        int charges, monthlyCharge = 180, netcharges;
        System.out.println("Enter the value of cr & lr = ");
        Scanner sc = new Scanner(System.in);
        cr = sc.nextInt();
        lr = sc.nextInt();
        unit = cr - lr;
        if(unit <= 150){
            charges = unit * 2;
        }
        else{
            if(unit <= 400){
                charges = (150 * 2) + (unit - 150) * 3;
            }
            else{
                charges = (150 *2) + (250*3) + (unit -400)*5;
            }
        }
        netcharges=charges+monthlyCharge;
        System.out.println("net charges = " + netcharges);


    }
}
