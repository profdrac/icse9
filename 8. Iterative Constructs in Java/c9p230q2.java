package class9.chapter8;
/**
 * WAP to get 50 numbers and count +ve, -ve, sum-of-+ve, sum-of -ve
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p230q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int cp=0,cn=0,sp=0,sn=0;
        for(int i=1;i<=50;i++)
        {
            System.out.print("Enter a number:");
            int n=sc.nextInt();
            if(n<0)
            {
                cn++;
                sn = sn + n;
            }
            if(n>0)
            {
                cp++;
                sp += n;
            }
        }
        System.out.println("-ve Numbers are "+cn);
        System.out.println("+ve Numbers are "+cp);
        System.out.println("Sum of -ve Numbers is "+sn);
        System.out.println("Sum of +ve Numbers is "+sp);
    }   
}