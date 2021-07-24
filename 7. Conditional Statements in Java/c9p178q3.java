package class9.chapter7;
/**
 * WAP to get 3 numbers and display greatest number if they are not equal
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p178q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a!=b && b!=c && c!=a)
        {
            if(a>b && a>c)
            {
                System.out.println(a+" is greatest");
            }
            else if(b>a && b>c)
            {
                System.out.println(b+" is greatest");
            }
            else
            {
                System.out.println(c+" is greatest");
            }
        }
        else
        {
            System.out.println("numbers are equal");
        }
    }   
}