package class9.chapter6;
/**
 * WAP to show result of various maths functions
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p145q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.println("Log = "+Math.log(n));
        System.out.println("Absolute = "+Math.abs(n));
        System.out.println("Square-Root = "+Math.sqrt(n));
        System.out.println("Cube = "+Math.pow(n,3));
        System.out.println("Random = "+Math.random());
    }   
}