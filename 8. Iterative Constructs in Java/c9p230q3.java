package class9.chapter8;
/**
 * WAP to find sum of even and odd numbers between m and n (both inclusive)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p230q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of m and n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int se=0,so=0;
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
                se+=i;
            else
                so+=i;
        }
        System.out.println("Sum of evens is "+se);
        System.out.println("Sum of odds is "+so);
    }   
}