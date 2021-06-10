
package class9.chapter5;
/**c9p101q2
 * 
 * WAP to accept basic-pay and display gross and net-pay
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class Employee
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic-pay:");
        double basic=sc.nextDouble();
        //calculate
        double da=30*basic/100;
        double hra=15*basic/100;
        double pf=12.5*basic/100;
        //--
        double gross=basic+da+hra;
        double net=gross-pf;
        
        System.out.println("Gross Salary= Rs."+gross);
        System.out.println("Net Salary= Rs."+net);
        sc.close();
    }   
}