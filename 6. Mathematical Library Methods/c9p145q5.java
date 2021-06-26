package class9.chapter6;
/**
 * WAP to find radius of a circle if area is given
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p145q5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter area of circle:");
        double a=sc.nextDouble();
        double r=Math.sqrt(7*a/22);
        System.out.print("Radius of the circle is "+r);
        sc.close();
    }   
}