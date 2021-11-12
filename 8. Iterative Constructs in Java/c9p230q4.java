package class9.chapter8;
/**
 * WAP to enter 50-numbers and check whether they are divisible by 5 or not.....
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p230q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int cnz=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter number:");
            int n=sc.nextInt();
            if(n%5==0)
            {
                if(n%10==5)
                    System.out.print("\n"+n);
                if(n%10==0)
                    cnz++;
            }
        }
        System.out.println("\nCount of numbers ending with zero is "+cnz);
    }   
}