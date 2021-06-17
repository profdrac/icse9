package class9.chapter5;
/**
 * WAP to find total cost price on selling 2 calculators at 20% and 20% loss
 * CP = ( SP * 100 ) / ( 100 + percentage profit)
 * CP = ( SP * 100 ) / ( 100 - percentage loss)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter selling price: Rs.");
        double sp=sc.nextDouble();
        double cpp=(sp*100)/(100+20);
        double cpl=(sp*100)/(100-20);
        double total=cpp+cpl;
        System.out.println("Total Cost Price= RS."+total);
        sc.close();
    }   
}