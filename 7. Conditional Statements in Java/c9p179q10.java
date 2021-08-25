package class9.chapter7;
/**
 * WAP to find amount to be paid and gift received on purchase of clothes
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p179q10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost:");
        double c=sc.nextDouble();
        double d=0;
        if(c<=2000)
        {
            d=c*5/100;
            System.out.println("Calculator");
        }
        else if(c>=2001 && c<=5000)
        {
            d=c*10/100;
            System.out.println("School Bag");
        }
        else if(c>=5001 && c<=10000)
        {
            d=c*15/100;
            System.out.println("Wall Clock");
        }
        else
        {
            d=c*20/100;
            System.out.println("Wrist Watch");
        }
        double amount=c-d;
        System.out.println("Amount to be paid is Rs."+amount);
    }   
}