
package class9.chapter7;
/**
 * WAP (menu-based) to convert temperature from F to C and vice-versa
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p181q15
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter temperature in Fahrenheit:");
                double f=sc.nextDouble();
                double c=5.0/9.0*(f-32);
                System.out.println(f+"F = "+c+"C");
                break;
            case 2:
                System.out.println("Enter temperature in Celsius:");
                c=sc.nextDouble();
                f=1.8*c+32;
                System.out.println(c+"C = "+f+"F");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }   
}