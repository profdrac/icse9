package class9.chapter5;

import java.util.Scanner;
/**
 * WAP to convert days to years, months and days
 */
class revision0618_5_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int d = sc.nextInt();
        int y = d/365;
        d = d%365;
        int m = d/30;
        d = d%30;
        System.out.println(y+" years "+m+" months "+d+" days");
        sc.close();
    }
}
