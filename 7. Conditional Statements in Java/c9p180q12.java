package class9.chapter7;
/**
 * WAP to find amount after maturity
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p180q12
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        double p=sc.nextDouble();
        System.out.print("Enter time [number of days]:");
        double t=sc.nextDouble();
        double i=0;
        if(t<=180)
        {
            t = t/365;
            i=(p*5.5*t)/100;
        }
        else if(t>180 && t<=364)
        {
            t = t/365;
            i=(p*7.5*t)/100;
        }
        else if(t==365)
        {
            t = t/365;
            i=(p*9.0*t)/100;
        }
        else
        {
            t = t/365;
            i=(p*8.5*t)/100;
        }
        double a=p+i;
        System.out.print("Amount on maturity = Rs."+a);
        sc.close();
    }   
}