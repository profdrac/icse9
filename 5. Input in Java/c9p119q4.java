package class9.chapter5;
/**
 * WAP to show discounts offered by two shopkeepers (30%, 20%+10%)
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price:");
        double p=sc.nextDouble();
        double d1=30*p/100;
        double d2=20*p/100;
        double d3=10*(p-d2)/100;
        System.out.println("Discount by first shopkeeper is Rs."+d1);
        System.out.println("Discount by second shopkeeper is Rs."+(d2+d3));
        sc.close();
    }   
}