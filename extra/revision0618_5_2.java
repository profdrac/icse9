package class9.chapter5;

import java.util.Scanner;
/**
 * WAP to find discounted price of Levis Jeans
 * where discount is 12.5% of printed price
 */
class revision0618_5_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of jeans: Rs.");
        double p = sc.nextDouble();
        double dis = 12.5*p/100;
        double amount = p-dis;
        System.out.println("You have to pay Rs."+amount);
        sc.close();
    }
}
