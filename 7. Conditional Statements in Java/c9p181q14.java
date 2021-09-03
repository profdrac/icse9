package class9.chapter7;
/**
 * WAP to show gross salary of an employee
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p181q14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the employee:");
        String n=sc.nextLine();
        System.out.print("Enter basic salary: Rs.");
        double bs=sc.nextDouble();
        double da=0,sa=0,gs=0;
        if(bs<=10000)
        {
            da=10*bs/100;
            sa=5*bs/100;
        }
        else if(bs>10000 && bs<=20000)
        {
            da=12*bs/100;
            sa=8*bs/100;
        }
        else if(bs>20000 && bs<=30000)
        {
            da=15*bs/100;
            sa=10*bs/100;
        }
        else
        {
            da=20*bs/100;
            sa=12*bs/100;
        }
        gs=bs+da+sa;
        System.out.println("Name\tBasic\tDA\tSA\tGross Salary");
        System.out.println(n+"\t"+bs+"\t"+da+"\t"+sa+"\t"+gs);
    }   
}