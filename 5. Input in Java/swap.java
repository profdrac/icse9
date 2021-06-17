package class9.chapter5;
/**
 * WAP to swap 2 numbers USING a third variable
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class swap
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two unequal numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping: a="+a+"\tb="+b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping: a="+a+"\tb="+b);
        sc.close();
    }
}