
package class9.chapter7;
/**
 * WAP to dislay details of a insurance policy
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p180q13
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the policy holder:");
        String n=sc.nextLine();
        System.out.print("Enter sum assured:");
        double s=sc.nextDouble();
        System.out.print("Enter annual premium:");
        double ap=sc.nextDouble();
        double d=0,c=0;
        if(s<=100000)
        {
            d=5*ap/100;
            c=2*ap/100;
        }
        else if(s>100000 && s<=200000)
        {
            d=8*ap/100;
            c=3*ap/100;
        }
        else if(s>200000 && s<=500000)
        {
            d=10*ap/100;
            c=5*ap/100;
        }
        else
        {
            d=15*ap/100;
            c=7.5*ap/100;
        }
        System.out.println("Name of the policy holder: "+n);
        System.out.println("Sum assured: Rs."+s);
        System.out.println("Premium: Rs."+ap);
        System.out.println("Discount on Premium: Rs."+d);
        System.out.println("Commission of the agent: Rs."+c);
        sc.close();
    }   
}