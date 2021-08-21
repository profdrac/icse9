package class9.chapter7;
/**
 * Page 149 Question 4
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p178q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0)
            System.out.print("Number is divisible by both 3 and 5");
        else if(n%3==0 && n%5!=0)
            System.out.print("Number is divisible by 3 and not 5");
        else if(n%3!=0 && n%5==0)
            System.out.print("Number is divisible by 5 and not 3");
        else
            System.out.print("Number is not divisible by 5 or 3");
    }   
}