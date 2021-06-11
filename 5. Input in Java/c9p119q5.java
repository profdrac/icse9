package class9.chapter5;
/**
 * WAP to find CI during 3 years at 5%/annum
 * @author (Ashutosh Sharma)
 */
import java.util.Scanner;
class c9p119q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sum:");
        double p=sc.nextDouble();
        //((P*(1+i)^n) - P)
        double i1=(p*(1+(5.0/100)))-p;
        System.out.println("Interest for first year: Rs."+i1);
        p=p+i1;
        double i2=(p*(1+(5.0/100)))-p;
        System.out.println("Interest for second year: Rs."+i2);
        p=p+i2;
        double i3=(p*(1+(5.0/100)))-p;
        System.out.println("Interest for third year: Rs."+i3);
        sc.close();
    }   
}