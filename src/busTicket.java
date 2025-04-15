import java.util.Scanner;

public class busTicket {
    public static void main(String[] args){
        int a;
        System.out.println("Enter stop choice = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Ticket to Panvel");
                break;
            case 2:
                System.out.println("Ticket to Pune");
                break;
            case 3:
                System.out.println("Ticket to Satara");
                break;
            case 4:
                System.out.println("Ticket to Kolhapur");
                break;
            default:
                System.out.println("Kolhapur");
        }
    }
}
