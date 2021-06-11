package class9.chapter5;
/**
 * WAP to calculate amount to be paid by customer after discount and GST
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter printed price:");
        double pp=sc.nextDouble();
        double dis=10*pp/100;
        pp=pp-dis;
        double gst=6*pp/100;
        double amt=pp+gst;
        System.out.print("Amount to be paid is Rs."+amt);
        sc.close();
    }   
}