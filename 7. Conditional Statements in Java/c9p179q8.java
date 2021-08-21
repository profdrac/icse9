package class9.chapter7;
/**
 * WAP to display greatest and smallest among 3 numbers
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p179q8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 unequal numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //System.out.println("Greatest number is "+Math.max(a,Math.max(b,c)));
        //System.out.println("Smallest number is "+Math.min(a,Math.min(b,c)));
        if(a>b && a>c)
            System.out.println(a+" is greatest");
        else if(b>a && b>c)
            System.out.println(b+" is greatest");
        else
            System.out.println(c+" is greatest");
        
        if(a<b && a<c)
            System.out.println(a+" is smallest");
        else if(b<a && b<c)
            System.out.println(b+" is smallest");
        else
            System.out.println(c+" is smallest");
    }   
}