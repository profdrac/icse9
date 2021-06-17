package class9.chapter5;
/**
 * WAP to swap 2 numbers without using a third variable
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two unequal numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping: a="+a+"\tb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+"\tb="+b);
        sc.close();
    }
}