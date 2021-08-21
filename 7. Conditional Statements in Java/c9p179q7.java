package class9.chapter7;
/**
 * WAP to display 2nd greatest/smallest among 3 numbers without if-else or ternary
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p179q7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 unequal numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //a=10,b=15,c=20
        //Math.min(Math.max(10,15),Math.max(15,20))
        //Math.min(15,20)
        //15
        System.out.println("Second smallest number is "+Math.min(Math.max(a,b),Math.max(b,c)));
    }   
}