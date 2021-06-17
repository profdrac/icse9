package class9.chapter5;
/**
 * WAP to convert seconds to hms
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total seconds:");
        int s=sc.nextInt();
        int h=s/3600;
        s=s%3600;
        int m=s/60;
        s=s%60;
        System.out.println(h+" hours, "+m+" minutes, "+s+" seconds");
        sc.close();
    }
}