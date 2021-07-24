package class9.chapter7;
/**
 * WAP to input 3 angles of a triangle and check type of triangle (if it is possible)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p178q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 angles:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180)
        {
            if(a<90 && b<90 && c<90)
            {
                System.out.println("Acute-Angled Triangle");
            }
            if(a==90||b==90||c==90)
            {
                System.out.println("Right-Angled Triangle");
            }
            if(a>90||b>90||c>90)
            {
                System.out.println("Obtuse-Angled Triangle");
            }
        }
        else
        {
            System.out.println("Triangle is not possible");
        }
    }   
}