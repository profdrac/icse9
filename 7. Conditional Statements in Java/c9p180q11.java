package class9.chapter7;
/**
 * WAP to find and display Income Tax payable or not
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p180q11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String n=sc.nextLine();
        System.out.print("Enter age:");
        int age=sc.nextInt();
        System.out.print("Enter income:");
        double in=sc.nextDouble();
        double it=0;
        if(age>60)
        {
            System.out.print("Wrong Category");
        }
        else
        {
            if(in<=250000)
                it=0;
            else if(in>250000 && in<=500000)
                it=(in-160000)*10/100;
            else if(in>500000 && in<=1000000)
                it=(in-500000)*20/100+34000;
            else
                it=(in-1000000)*30/100+94000;
            System.out.print("Income Tax= Rs."+it);
        }
    }   
}