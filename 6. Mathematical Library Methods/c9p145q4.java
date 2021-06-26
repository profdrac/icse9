package class9.chapter6;
/**
 * WAP to get marks in PCB. Find average marks and show in rounded form
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p145q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in Physics, Chemistry and Biology:");
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        double avg=(p+c+b)/3;
        System.out.println("Average marks are "+Math.round(avg));
        sc.close();
    }   
}