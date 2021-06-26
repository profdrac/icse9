package class9.chapter6;
/**
 * WAP to input 3 numbers and display the greatest and smallest (using library functions)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p145q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 unequal numbers:");
        int a =sc.nextInt();    //12
        int b =sc.nextInt();    //17
        int c =sc.nextInt();    //6
        System.out.println("Greatest number is "+Math.max(Math.max(a,b),c));    // 17
        System.out.println("Smallest number is "+Math.min(Math.min(a,b),c));    // 6
    }   
}