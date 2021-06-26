package class9.chapter6;
/**
 * WAP to display hypotenuse of a Right-Angles Triangle by taking perpendicular and base as input
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p145q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of perpendicular and base:");
        int p=sc.nextInt();
        int b=sc.nextInt();
        double h=Math.sqrt(p*p+b*b);
        System.out.print("Hypotenuse is "+h);
        sc.close();
    }   
}