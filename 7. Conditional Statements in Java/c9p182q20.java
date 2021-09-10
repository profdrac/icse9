package class9.chapter7;
/**
 * WAP to print net amount to be paid after puchasing a desktop/laptop
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p1182q20
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String n=sc.nextLine();
        System.out.print("What is the price of computer? Rs.");
        double p=sc.nextDouble();
        System.out.print("Have you purchased Desktop or Laptop [Press D/L]:");
        String type=sc.next();
        double d=0;
        switch(type)
        {
            case "D":
                if(p<=25000)
                    d=p*5/100;
                else if(p>25000 && p<=50000)
                    d=p*7.5/100;
                else if(p>50000 && p<=100000)
                    d=p*10.0/100;
                else
                    d=p*15.0/100;
                break;
            case "L":
                if(p<=25000)
                    d=0;
                else if(p>25000 && p<=50000)
                    d=p*5/100;
                else if(p>50000 && p<=100000)
                    d=p*7.5/100;
                else
                    d=p*10/100;
                break;
            default:
                System.out.print("Not a cetegory!");
        }
        System.out.println("\fName = "+n+"\tNet Amount = Rs."+(p-d));
    }   
}