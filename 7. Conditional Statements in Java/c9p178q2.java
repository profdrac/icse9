package class9.chapter7;
/**
 * WAP to get cost and selling price and find profit/loss % or none
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p178q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        double cp=sc.nextDouble();
        System.out.println("Enter selling price");
        double sp=sc.nextDouble();
        if(cp<sp)
        {
            double pp=100*(sp-cp)/cp;
            System.out.println("Profit="+pp+"%");
        }
        else if(cp>sp)
        {
            double lp=100*(cp-sp)/cp;
            System.out.println("Loss="+lp+"%");
        }
        else
        {
            System.out.println("Neither profit nor loss");
        }
    }   
}