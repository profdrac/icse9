package class9.chapter5;
/**
 * WAP to find difference between CI and SI per annum for 3 years at 10% rate
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount invested:");
        double p=sc.nextDouble();
        double si=(p*10*3)/100;
        double ci=p*Math.pow((1+10.0/100),3) - p;
        System.out.println("Simple Interest = Rs."+si);
        System.out.println("Compound Interest = Rs."+ci);
        sc.close();
    }   
}