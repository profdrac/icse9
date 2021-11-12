package class9.chapter8;
/**
 * WAP to show perfect squares between m and n
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p230q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of m and n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int sq=(int) Math.sqrt(i);
            if(sq*sq==i)
            System.out.print(i+" ");
        }
        sc.close();
    }   
}