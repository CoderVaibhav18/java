import java.util.Scanner;
class diwaliOffere {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pant ,disc, Netamt;
        System.out.println("enter amount");
        pant= sc.nextDouble();
        if(pant>500 && pant<=2000)
        {
            disc = pant*0.03;
        }
        else
        {
            if(pant>2000 && pant<=5000)
            {
                disc= pant*0.05;
            }
            else{
                if(pant>5000 && pant<=20000){
                    disc=pant*0.08;
                }
               else{
                   if(pant>20000){
                       disc=pant*0.1;
                   }
                   else{
                       disc=0;
                   }
                }
            }

        }
        Netamt =pant-disc;
        System.out.println("pant" +pant);
        System.out.println("disc" +disc);
        System.out.println("Netamt" + Netamt);
    }
}
