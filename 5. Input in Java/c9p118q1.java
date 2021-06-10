package class9.chapter5;
import java.util.Scanner;

class c9p118q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of length:");
        int l=sc.nextInt();
        System.out.print("Enter value of gravity:");
        int g=sc.nextInt();
        double t=2*3.142*Math.sqrt(l/g);
        System.out.print("Time period of the pendulum is "+t+" seconds");
        sc.close();
    }
}